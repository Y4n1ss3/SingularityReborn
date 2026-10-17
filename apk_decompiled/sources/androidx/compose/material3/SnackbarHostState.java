package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.d41;
import defpackage.fg;
import defpackage.gg;
import defpackage.hm;
import defpackage.kp0;
import defpackage.lb0;
import defpackage.ob0;
import defpackage.p10;
import defpackage.q10;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final lb0 mutex = new ob0();
    private final MutableState currentSnackbarData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SnackbarDataImpl implements SnackbarData {
        private final fg continuation;
        private final SnackbarVisuals visuals;

        public SnackbarDataImpl(SnackbarVisuals snackbarVisuals, fg fgVar) {
            this.visuals = snackbarVisuals;
            this.continuation = fgVar;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                this.continuation.resumeWith(SnackbarResult.Dismissed);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarDataImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) obj;
            return q10.b(getVisuals(), snackbarDataImpl.getVisuals()) && q10.b(this.continuation, snackbarDataImpl.continuation);
        }

        @Override // androidx.compose.material3.SnackbarData
        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        public int hashCode() {
            return this.continuation.hashCode() + (getVisuals().hashCode() * 31);
        }

        @Override // androidx.compose.material3.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                this.continuation.resumeWith(SnackbarResult.ActionPerformed);
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SnackbarVisualsImpl implements SnackbarVisuals {
        private final String actionLabel;
        private final SnackbarDuration duration;
        private final String message;
        private final boolean withDismissAction;

        public SnackbarVisualsImpl(String str, String str2, boolean z, SnackbarDuration snackbarDuration) {
            this.message = str;
            this.actionLabel = str2;
            this.withDismissAction = z;
            this.duration = snackbarDuration;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarVisualsImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) obj;
            return q10.b(getMessage(), snackbarVisualsImpl.getMessage()) && q10.b(getActionLabel(), snackbarVisualsImpl.getActionLabel()) && getWithDismissAction() == snackbarVisualsImpl.getWithDismissAction() && getDuration() == snackbarVisualsImpl.getDuration();
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public int hashCode() {
            int hashCode = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            return getDuration().hashCode() + kp0.c((hashCode + (actionLabel != null ? actionLabel.hashCode() : 0)) * 31, 31, getWithDismissAction());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z, SnackbarDuration snackbarDuration, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            snackbarDuration = str3 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        return snackbarHostState.showSnackbar(str, str3, z2, snackbarDuration, hmVar);
    }

    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        if (r9.d(r0) == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.material3.SnackbarVisuals, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [lb0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showSnackbar(SnackbarVisuals snackbarVisuals, hm hmVar) {
        SnackbarHostState$showSnackbar$2 snackbarHostState$showSnackbar$2;
        int i;
        vn vnVar;
        ob0 ob0Var;
        SnackbarVisuals snackbarVisuals2;
        Throwable th;
        Object s;
        lb0 lb0Var;
        try {
            try {
                if (hmVar instanceof SnackbarHostState$showSnackbar$2) {
                    snackbarHostState$showSnackbar$2 = (SnackbarHostState$showSnackbar$2) hmVar;
                    int i2 = snackbarHostState$showSnackbar$2.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        snackbarHostState$showSnackbar$2.label = i2 - Integer.MIN_VALUE;
                        Object obj = snackbarHostState$showSnackbar$2.result;
                        i = snackbarHostState$showSnackbar$2.label;
                        vnVar = vn.d;
                        if (i != 0) {
                            p10.Q(obj);
                            lb0 lb0Var2 = this.mutex;
                            snackbarHostState$showSnackbar$2.L$0 = snackbarVisuals;
                            snackbarHostState$showSnackbar$2.L$1 = lb0Var2;
                            snackbarHostState$showSnackbar$2.label = 1;
                            ob0Var = (ob0) lb0Var2;
                            snackbarVisuals2 = snackbarVisuals;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                lb0Var = (lb0) snackbarHostState$showSnackbar$2.L$1;
                                try {
                                    p10.Q(obj);
                                    setCurrentSnackbarData(null);
                                    ((ob0) lb0Var).f(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    setCurrentSnackbarData(null);
                                    throw th;
                                }
                            }
                            ?? r8 = (lb0) snackbarHostState$showSnackbar$2.L$1;
                            SnackbarVisuals snackbarVisuals3 = (SnackbarVisuals) snackbarHostState$showSnackbar$2.L$0;
                            p10.Q(obj);
                            ob0Var = r8;
                            snackbarVisuals2 = snackbarVisuals3;
                        }
                        snackbarHostState$showSnackbar$2.L$0 = snackbarVisuals2;
                        snackbarHostState$showSnackbar$2.L$1 = ob0Var;
                        snackbarHostState$showSnackbar$2.L$2 = snackbarHostState$showSnackbar$2;
                        snackbarHostState$showSnackbar$2.label = 2;
                        gg ggVar = new gg(1, d41.C(snackbarHostState$showSnackbar$2));
                        ggVar.u();
                        setCurrentSnackbarData(new SnackbarDataImpl(snackbarVisuals2, ggVar));
                        s = ggVar.s();
                        if (s != vnVar) {
                            ob0 ob0Var2 = ob0Var;
                            obj = s;
                            lb0Var = ob0Var2;
                            setCurrentSnackbarData(null);
                            ((ob0) lb0Var).f(null);
                            return obj;
                        }
                        return vnVar;
                    }
                }
                snackbarHostState$showSnackbar$2.L$0 = snackbarVisuals2;
                snackbarHostState$showSnackbar$2.L$1 = ob0Var;
                snackbarHostState$showSnackbar$2.L$2 = snackbarHostState$showSnackbar$2;
                snackbarHostState$showSnackbar$2.label = 2;
                gg ggVar2 = new gg(1, d41.C(snackbarHostState$showSnackbar$2));
                ggVar2.u();
                setCurrentSnackbarData(new SnackbarDataImpl(snackbarVisuals2, ggVar2));
                s = ggVar2.s();
                if (s != vnVar) {
                }
                return vnVar;
            } catch (Throwable th3) {
                th = th3;
                setCurrentSnackbarData(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th4) {
            ((ob0) snackbarVisuals).f(null);
            throw th4;
        }
        snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, hmVar);
        Object obj2 = snackbarHostState$showSnackbar$2.result;
        i = snackbarHostState$showSnackbar$2.label;
        vnVar = vn.d;
    }

    public final Object showSnackbar(String str, String str2, boolean z, SnackbarDuration snackbarDuration, hm hmVar) {
        return showSnackbar(new SnackbarVisualsImpl(str, str2, z, snackbarDuration), hmVar);
    }
}
