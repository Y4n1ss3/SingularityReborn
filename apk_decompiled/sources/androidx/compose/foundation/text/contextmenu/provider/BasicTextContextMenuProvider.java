package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.d41;
import defpackage.hm;
import defpackage.iy;
import defpackage.my;
import defpackage.py;
import defpackage.vn;
import defpackage.w01;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicTextContextMenuProvider implements TextContextMenuProvider {
    public static final int $stable = 0;
    private final py contextMenuBlock;
    private final MutatorMutex mutatorMutex = new MutatorMutex();
    private final MutableState session$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class SessionImpl implements TextContextMenuSession {
        private final zg channel = d41.b(0, 7, null);
        private final TextContextMenuDataProvider dataProvider;

        public SessionImpl(TextContextMenuDataProvider textContextMenuDataProvider) {
            this.dataProvider = textContextMenuDataProvider;
        }

        public final Object awaitClose(hm hmVar) {
            Object i = this.channel.i(hmVar);
            return i == vn.d ? i : w01.a;
        }

        @Override // androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession
        public void close() {
            this.channel.m(w01.a);
        }

        public final TextContextMenuDataProvider getDataProvider() {
            return this.dataProvider;
        }
    }

    public BasicTextContextMenuProvider(py pyVar) {
        this.contextMenuBlock = pyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenu$lambda$0(BasicTextContextMenuProvider basicTextContextMenuProvider, iy iyVar, int i, Composer composer, int i2) {
        basicTextContextMenuProvider.ContextMenu(iyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenu$lambda$1(BasicTextContextMenuProvider basicTextContextMenuProvider, iy iyVar, int i, Composer composer, int i2) {
        basicTextContextMenuProvider.ContextMenu(iyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final SessionImpl getSession() {
        return (SessionImpl) this.session$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSession(SessionImpl sessionImpl) {
        this.session$delegate.setValue(sessionImpl);
    }

    public final void ContextMenu(final iy iyVar, Composer composer, final int i) {
        int i2;
        final iy iyVar2;
        Composer startRestartGroup = composer.startRestartGroup(723898654);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(723898654, i2, -1, "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.ContextMenu (BasicTextContextMenuProvider.kt:137)");
            }
            SessionImpl session = getSession();
            if (session == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new my(this) { // from class: wc
                        public final /* synthetic */ BasicTextContextMenuProvider e;

                        {
                            this.e = this;
                        }

                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 ContextMenu$lambda$0;
                            w01 ContextMenu$lambda$1;
                            int i5 = i3;
                            int i6 = i;
                            iy iyVar3 = iyVar;
                            BasicTextContextMenuProvider basicTextContextMenuProvider = this.e;
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    ContextMenu$lambda$0 = BasicTextContextMenuProvider.ContextMenu$lambda$0(basicTextContextMenuProvider, iyVar3, i6, composer2, intValue);
                                    return ContextMenu$lambda$0;
                                default:
                                    ContextMenu$lambda$1 = BasicTextContextMenuProvider.ContextMenu$lambda$1(basicTextContextMenuProvider, iyVar3, i6, composer2, intValue);
                                    return ContextMenu$lambda$1;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            iyVar2 = iyVar;
            this.contextMenuBlock.invoke(session, session.getDataProvider(), iyVar2, startRestartGroup, Integer.valueOf((i2 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            iyVar2 = iyVar;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new my(this) { // from class: wc
                public final /* synthetic */ BasicTextContextMenuProvider e;

                {
                    this.e = this;
                }

                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 ContextMenu$lambda$0;
                    w01 ContextMenu$lambda$1;
                    int i5 = i4;
                    int i6 = i;
                    iy iyVar3 = iyVar2;
                    BasicTextContextMenuProvider basicTextContextMenuProvider = this.e;
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            ContextMenu$lambda$0 = BasicTextContextMenuProvider.ContextMenu$lambda$0(basicTextContextMenuProvider, iyVar3, i6, composer2, intValue);
                            return ContextMenu$lambda$0;
                        default:
                            ContextMenu$lambda$1 = BasicTextContextMenuProvider.ContextMenu$lambda$1(basicTextContextMenuProvider, iyVar3, i6, composer2, intValue);
                            return ContextMenu$lambda$1;
                    }
                }
            });
        }
    }

    public final void cancel() {
        SessionImpl session = getSession();
        if (session != null) {
            session.close();
        }
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider
    public Object showTextContextMenu(TextContextMenuDataProvider textContextMenuDataProvider, hm hmVar) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new BasicTextContextMenuProvider$showTextContextMenu$2(this, new SessionImpl(textContextMenuDataProvider), null), hmVar, 1, null);
        return mutate$default == vn.d ? mutate$default : w01.a;
    }
}
