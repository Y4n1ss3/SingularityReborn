package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.Utils_androidKt;
import defpackage.ds0;
import defpackage.o;
import defpackage.ut;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SourceInformationKt {
    private static final boolean hasSection(SourceInfoParserState sourceInfoParserState) {
        return sourceInfoParserState.getI() < sourceInfoParserState.getData().length() - 1 && Character.isLetter(sourceInfoParserState.getData().charAt(sourceInfoParserState.getI())) && sourceInfoParserState.getData().charAt(sourceInfoParserState.getI() + 1) == '(';
    }

    private static final List<LocationSourceInformation> parseLocations(SourceInfoParserState sourceInfoParserState) {
        boolean z;
        Integer num;
        ArrayList arrayList = new ArrayList();
        while (!sourceInfoParserState.atEnd() && !sourceInfoParserState.matches(':')) {
            if (sourceInfoParserState.matches('*')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                z = true;
            } else {
                z = false;
            }
            Integer valueOf = !sourceInfoParserState.matches('@') ? Integer.valueOf(sourceInfoParserState.takeIntUntil("@") + 1) : null;
            SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            int takeIntUntil = sourceInfoParserState.takeIntUntil("L,:");
            if (sourceInfoParserState.matches('L')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                num = Integer.valueOf(sourceInfoParserState.takeIntUntil(",:"));
            } else {
                num = null;
            }
            arrayList.add(new LocationSourceInformation(valueOf != null ? valueOf.intValue() : -1, takeIntUntil, num != null ? num.intValue() : -1, z));
            if (sourceInfoParserState.matches(',')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            }
        }
        SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
        return arrayList;
    }

    private static final List<ParameterSourceInformation> parseParameterIndex(SourceInfoParserState sourceInfoParserState) {
        String str;
        sourceInfoParserState.advance(2);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!sourceInfoParserState.atEnd() && !sourceInfoParserState.matches(')')) {
            if (sourceInfoParserState.matches('!')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                String takeUntil = sourceInfoParserState.takeUntil("!,)");
                if (takeUntil.length() != 0) {
                    int parseInt = Integer.parseInt(takeUntil);
                    int i = 0;
                    while (parseInt > 0) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                arrayList.add(new ParameterSourceInformation(i, null, null, 6, null));
                                parseInt--;
                                break;
                            }
                            if (((ParameterSourceInformation) arrayList.get(i2)).getSortedIndex() == i) {
                                i++;
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    z = true;
                }
            } else {
                int takeIntUntil = sourceInfoParserState.takeIntUntil("!:,)");
                if (sourceInfoParserState.matches(':')) {
                    SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                    str = replaceComposePrefix(sourceInfoParserState.takeUntil("!,)"));
                } else {
                    str = null;
                }
                if (z) {
                    int i3 = 0;
                    while (i3 < takeIntUntil) {
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                arrayList.add(new ParameterSourceInformation(i3, null, null, 6, null));
                                break;
                            }
                            if (((ParameterSourceInformation) arrayList.get(i4)).getSortedIndex() == i3) {
                                i3++;
                                break;
                            }
                            i4++;
                        }
                    }
                    z = false;
                }
                arrayList.add(new ParameterSourceInformation(takeIntUntil, null, str, 2, null));
            }
            if (sourceInfoParserState.matches(',')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            }
        }
        sourceInfoParserState.expect(')');
        SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
        return arrayList;
    }

    private static final List<ParameterSourceInformation> parseParameterNames(SourceInfoParserState sourceInfoParserState) {
        String str;
        sourceInfoParserState.advance(2);
        ArrayList arrayList = new ArrayList();
        while (!sourceInfoParserState.atEnd() && !sourceInfoParserState.matches(')')) {
            String takeUntil = sourceInfoParserState.takeUntil(":,)");
            if (sourceInfoParserState.matches(':')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                str = replaceComposePrefix(sourceInfoParserState.takeUntil(",)"));
            } else {
                str = null;
            }
            arrayList.add(new ParameterSourceInformation(arrayList.size(), takeUntil, str));
            if (sourceInfoParserState.matches(',')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            }
        }
        sourceInfoParserState.expect(')');
        SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
        return arrayList;
    }

    public static final SourceInformation parseSourceInformation(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return parseSourceInformationInternal(str);
        } catch (ParseException e) {
            Utils_androidKt.logError(e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SourceInformation parseSourceInformationInternal(String str) {
        boolean z;
        boolean z2;
        String str2;
        String takeUntil;
        SourceInfoParserState sourceInfoParserState = new SourceInfoParserState(str);
        String str3 = null;
        if (sourceInfoParserState.matches('C')) {
            SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            if (sourceInfoParserState.matches('C')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                z = true;
            } else {
                z = false;
            }
            if (sourceInfoParserState.matches('(')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                str2 = sourceInfoParserState.takeUntil(")");
                sourceInfoParserState.expect(')');
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                z2 = true;
                List list = ut.d;
                List list2 = list;
                while (hasSection(sourceInfoParserState)) {
                    char current = sourceInfoParserState.current();
                    if (current == 'N') {
                        list2 = parseParameterNames(sourceInfoParserState);
                    } else if (current != 'P') {
                        sourceInfoParserState.advance(2);
                        int i = 0;
                        while (true) {
                            if (i <= 0 && sourceInfoParserState.matches(')')) {
                                sourceInfoParserState.expect(')');
                                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                                break;
                            }
                            if (sourceInfoParserState.atEnd()) {
                                sourceInfoParserState.throwParseError("unexpected end");
                                o.j();
                                return null;
                            }
                            if (sourceInfoParserState.matches('(')) {
                                i++;
                            } else if (sourceInfoParserState.matches(')')) {
                                i--;
                            }
                            SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                        }
                    } else {
                        list2 = parseParameterIndex(sourceInfoParserState);
                    }
                }
                if (sourceInfoParserState.matches(':')) {
                    list = parseLocations(sourceInfoParserState);
                } else {
                    SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                }
                takeUntil = sourceInfoParserState.takeUntil("#");
                if (takeUntil.length() <= 0) {
                    takeUntil = null;
                }
                if (sourceInfoParserState.matches('#')) {
                    SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                    str3 = sourceInfoParserState.takeUntilEnd();
                }
                return new SourceInformation(z2, z, str2, takeUntil, list2, str3, list, str);
            }
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        str2 = null;
        List list3 = ut.d;
        List list22 = list3;
        while (hasSection(sourceInfoParserState)) {
        }
        if (sourceInfoParserState.matches(':')) {
        }
        takeUntil = sourceInfoParserState.takeUntil("#");
        if (takeUntil.length() <= 0) {
        }
        if (sourceInfoParserState.matches('#')) {
        }
        return new SourceInformation(z2, z, str2, takeUntil, list22, str3, list3, str);
    }

    private static final String replaceComposePrefix(String str) {
        str.getClass();
        int m0 = ds0.m0(str, "c#", 0, false, 2);
        return m0 < 0 ? str : ds0.u0(str, m0, 2 + m0, "androidx.compose.").toString();
    }
}
