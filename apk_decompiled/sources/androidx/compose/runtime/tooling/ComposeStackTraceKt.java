package androidx.compose.runtime.tooling;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.runtime.MovableContentKt;
import defpackage.d41;
import defpackage.iy;
import defpackage.m50;
import defpackage.mf0;
import defpackage.q10;
import defpackage.s80;
import defpackage.ut;
import defpackage.x10;
import defpackage.y80;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposeStackTraceKt {
    private static final boolean IncludeDebugInfo = false;
    private static final String RuntimePackageHash = "9igjgp";

    public static final void appendGroupKeyStackTrace(StringBuilder sb, ComposeStackTrace composeStackTrace) {
        List<ComposeStackTraceFrame> filterInternalFramesByGroupKey = filterInternalFramesByGroupKey(composeStackTrace);
        int size = filterInternalFramesByGroupKey.size();
        for (int i = 0; i < size; i++) {
            ComposeStackTraceFrame composeStackTraceFrame = filterInternalFramesByGroupKey.get(i);
            sb.append("\tat $$compose.m$");
            sb.append(composeStackTraceFrame.getGroupKey());
            sb.append("(SourceFile:1)");
            sb.append('\n');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void appendSourceInformationStackTrace(StringBuilder sb, ComposeStackTrace composeStackTrace) {
        String sourceFile;
        m50 o = y80.o();
        List<ComposeStackTraceFrame> frames = composeStackTrace.getFrames();
        frames.getClass();
        s80 s80Var = new s80(frames);
        int size = s80Var.size();
        String str = null;
        String str2 = null;
        for (int i = 0; i < size; i++) {
            ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) s80Var.get(i);
            SourceInformation sourceInfo = composeStackTraceFrame.getSourceInfo();
            if (sourceInfo != null) {
                String functionName = sourceInfo.getFunctionName();
                if (functionName == null) {
                    functionName = sourceInfo.isCall() ? "<lambda>" : null;
                    if (functionName == null) {
                        if (str == null) {
                            str = "<unknown function>";
                        }
                        sourceFile = sourceInfo.getSourceFile();
                        if (sourceFile == null) {
                            str2 = sourceFile;
                        } else if (str2 == null) {
                            str2 = "<unknown file>";
                        }
                        List<LocationSourceInformation> locations = sourceInfo.getLocations();
                        String str3 = str + '(' + str2 + ':' + ((composeStackTraceFrame.getGroupOffset() != null || composeStackTraceFrame.getGroupOffset().intValue() >= locations.size()) ? "<unknown line>" : String.valueOf(locations.get(composeStackTraceFrame.getGroupOffset().intValue()).getLineNumber())) + ')';
                        if (!sourceInfo.isCall()) {
                        }
                        if (q10.b(sourceInfo.getFunctionName(), "rememberCompositionContext") || !q10.b(sourceInfo.getPackageHash(), RuntimePackageHash)) {
                            o.add(str3);
                        }
                    }
                }
                str = functionName;
                sourceFile = sourceInfo.getSourceFile();
                if (sourceFile == null) {
                }
                List<LocationSourceInformation> locations2 = sourceInfo.getLocations();
                if (composeStackTraceFrame.getGroupOffset() != null) {
                }
                String str32 = str + '(' + str2 + ':' + ((composeStackTraceFrame.getGroupOffset() != null || composeStackTraceFrame.getGroupOffset().intValue() >= locations2.size()) ? "<unknown line>" : String.valueOf(locations2.get(composeStackTraceFrame.getGroupOffset().intValue()).getLineNumber())) + ')';
                if (!sourceInfo.isCall()) {
                }
                if (q10.b(sourceInfo.getFunctionName(), "rememberCompositionContext")) {
                }
                o.add(str32);
            }
        }
        m50 d = y80.d(o);
        d.getClass();
        s80 s80Var2 = new s80(d);
        int size2 = s80Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str4 = (String) s80Var2.get(i2);
            sb.append("\tat ");
            sb.append(str4);
            sb.append('\n');
        }
    }

    public static final void appendStackTrace(StringBuilder sb, ComposeStackTrace composeStackTrace) {
        if (composeStackTrace.getHasSourceInformation()) {
            appendSourceInformationStackTrace(sb, composeStackTrace);
        } else {
            appendGroupKeyStackTrace(sb, composeStackTrace);
        }
    }

    public static final Throwable attachComposeStackTrace(Throwable th, iy iyVar) {
        tryAttachComposeStackTrace(th, iyVar);
        return th;
    }

    public static final List<ComposeStackTraceFrame> filterInternalFramesByGroupKey(ComposeStackTrace composeStackTrace) {
        int[] iArr = {ComposerKt.providerKey, ComposerKt.compositionLocalMapKey, ComposerKt.providerMapsKey, ComposerKt.referenceKey, ComposerKt.reuseKey, GapComposerKt.nodeKey, ComposerKt.defaultsKey, MovableContentKt.movableContentKey, ComposerKt.invocationKey};
        int size = composeStackTrace.getFrames().size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ComposeStackTraceFrame composeStackTraceFrame = composeStackTrace.getFrames().get(i);
            int groupKey = composeStackTraceFrame.getGroupKey();
            int i3 = 0;
            while (true) {
                if (i3 >= 9) {
                    i3 = -1;
                    break;
                }
                if (groupKey == iArr[i3]) {
                    break;
                }
                i3++;
            }
            if (i3 < 0) {
                if (composeStackTraceFrame.getGroupKey() == 100) {
                    int i4 = i + 2;
                    if (i4 < size && composeStackTrace.getFrames().get(i4).getGroupKey() == 1000) {
                        break;
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                } else {
                    arrayList.add(composeStackTraceFrame);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r7.getFrames().isEmpty() == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean tryAttachComposeStackTrace(Throwable th, iy iyVar) {
        List asList;
        ComposeStackTrace composeStackTrace;
        Object invoke;
        th.getClass();
        Integer num = x10.a;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        } else {
            Method method = mf0.b;
            if (method == null || (invoke = method.invoke(th, null)) == null) {
                asList = ut.d;
            } else {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            }
        }
        int size = asList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) asList.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            composeStackTrace = (ComposeStackTrace) iyVar.invoke();
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (composeStackTrace != null) {
            if (composeStackTrace.getHasSourceInformation()) {
                List<ComposeStackTraceFrame> frames = composeStackTrace.getFrames();
                int size2 = frames.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (frames.get(i2).getSourceInfo() != null) {
                        z = true;
                        break;
                    }
                }
            }
            diagnosticComposeException = th2;
            if (diagnosticComposeException != null) {
                d41.c(th, diagnosticComposeException);
            }
            return z;
        }
        if (z) {
            composeStackTrace.getClass();
            diagnosticComposeException = new DiagnosticComposeException(composeStackTrace);
        }
        if (diagnosticComposeException != null) {
        }
        return z;
    }
}
