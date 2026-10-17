package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.composer.GroupSourceInformation;
import defpackage.ks0;
import defpackage.o;
import defpackage.q10;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class ComposeStackTraceBuilder {
    public static final int $stable = 8;
    private final List<ComposeStackTraceFrame> _trace = new ArrayList();

    private final boolean appendGroupSourceInformation(int i, GroupSourceInformation groupSourceInformation, Object obj) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        boolean z = false;
        if (groups == null) {
            if (!groupSourceInformation.getClosed()) {
                appendTraceFrame(i, groupSourceInformation, null);
                return true;
            }
            int dataStartOffset = groupSourceInformation.getDataStartOffset();
            int dataEndOffset = groupSourceInformation.getDataEndOffset();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int intValue = number.intValue();
                if ((dataStartOffset <= intValue && intValue < dataEndOffset) || (dataStartOffset == dataEndOffset && dataStartOffset == number.intValue())) {
                    z = true;
                }
                if (z) {
                    appendTraceFrame(groupSourceInformation.getKey(), groupSourceInformation, null);
                }
            }
            return z;
        }
        int size = groups.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = groups.get(i2);
            if (!(obj2 instanceof Anchor)) {
                if (!(obj2 instanceof GroupSourceInformation)) {
                    o.p(obj2, "Unexpected child source info ");
                    break;
                }
                if (appendGroupSourceInformation(i, (GroupSourceInformation) obj2, obj)) {
                    appendTraceFrame(groupSourceInformation.getKey(), groupSourceInformation, obj2);
                    return true;
                }
            } else if (obj2.equals(obj)) {
                appendTraceFrame(groupSourceInformation.getKey(), groupSourceInformation, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    private final void appendTraceFrame(int i, GroupSourceInformation groupSourceInformation, Object obj) {
        ComposeStackTraceFrame extractTraceFrame = extractTraceFrame(i, groupSourceInformation, obj);
        if (extractTraceFrame != null) {
            this._trace.add(extractTraceFrame);
        }
    }

    private final ComposeStackTraceFrame extractTraceFrame(int i, GroupSourceInformation groupSourceInformation, Object obj) {
        ArrayList<Object> groups;
        String sourceInformation;
        SourceInformation parseSourceInformation = (groupSourceInformation == null || (sourceInformation = groupSourceInformation.getSourceInformation()) == null) ? null : SourceInformationKt.parseSourceInformation(sourceInformation);
        if (parseSourceInformation == null) {
            return new ComposeStackTraceFrame(i, null, null);
        }
        if (obj == null) {
            return new ComposeStackTraceFrame(i, parseSourceInformation, null);
        }
        ArrayList<Object> groups2 = groupSourceInformation.getGroups();
        int i2 = 0;
        if (groups2 != null) {
            int size = groups2.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Object obj2 = groups2.get(i4);
                if (q10.b(obj2, obj)) {
                    break;
                }
                GroupSourceInformation sourceInformationOf = sourceInformationOf(obj2);
                if (sourceInformationOf != null && (sourceInformationOf.getKey() == -127 || (sourceInformationOf.getKey() == 0 && (obj2 instanceof Anchor) && groupKeyOf((Anchor) obj2) == -127))) {
                    if ((sourceInformationOf != null ? sourceInformationOf.getSourceInformation() : null) == null) {
                        if (sourceInformationOf != null && (groups = sourceInformationOf.getGroups()) != null) {
                            int size2 = groups.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                GroupSourceInformation sourceInformationOf2 = sourceInformationOf(groups.get(i5));
                                if (sourceInformationOf2 != null && isCall(sourceInformationOf2)) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
                if (sourceInformationOf != null && isCall(sourceInformationOf)) {
                    i3++;
                }
            }
            i2 = i3;
        }
        return new ComposeStackTraceFrame(i, parseSourceInformation, Integer.valueOf(i2));
    }

    private final boolean isCall(GroupSourceInformation groupSourceInformation) {
        String sourceInformation = groupSourceInformation.getSourceInformation();
        return sourceInformation != null && ks0.c0(sourceInformation, "C", false);
    }

    private final GroupSourceInformation sourceInformationOf(Object obj) {
        if (obj instanceof Anchor) {
            return sourceInformationOf((Anchor) obj);
        }
        if (obj instanceof GroupSourceInformation) {
            return (GroupSourceInformation) obj;
        }
        o.p(obj, "Unexpected child source info ");
        return null;
    }

    public abstract int groupKeyOf(Anchor anchor);

    public final void processEdge(int i, Object obj, GroupSourceInformation groupSourceInformation, Object obj2) {
        if (groupSourceInformation != null || q10.b(obj, Composer.Companion.getEmpty())) {
            if (obj2 == null || groupSourceInformation == null) {
                appendTraceFrame(i, groupSourceInformation, null);
            } else {
                if (appendGroupSourceInformation(i, groupSourceInformation, obj2) || groupSourceInformation.getClosed()) {
                    return;
                }
                appendTraceFrame(i, groupSourceInformation, obj2);
            }
        }
    }

    public abstract GroupSourceInformation sourceInformationOf(Anchor anchor);

    public final List<ComposeStackTraceFrame> trace() {
        return this._trace;
    }
}
