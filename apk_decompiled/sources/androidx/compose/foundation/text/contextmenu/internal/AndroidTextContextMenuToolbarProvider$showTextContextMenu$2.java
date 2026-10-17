package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.q10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", l = {181}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AndroidTextContextMenuToolbarProvider$showTextContextMenu$2 extends us0 implements ky {
    final /* synthetic */ TextContextMenuDataProvider $dataProvider;
    int label;
    final /* synthetic */ AndroidTextContextMenuToolbarProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextContextMenuDataProvider textContextMenuDataProvider, hm hmVar) {
        super(1, hmVar);
        this.this$0 = androidTextContextMenuToolbarProvider;
        this.$dataProvider = textContextMenuDataProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextActionModeCallback textActionModeCallback, AndroidTextContextMenuToolbarProvider.TextContextMenuSessionImpl textContextMenuSessionImpl) {
        View view;
        ActionMode actionMode;
        TextToolbarHelper textToolbarHelper = TextToolbarHelper.INSTANCE;
        view = androidTextContextMenuToolbarProvider.view;
        ActionMode startActionMode = textToolbarHelper.startActionMode(view, textActionModeCallback);
        actionMode = androidTextContextMenuToolbarProvider.actionMode;
        q10.b(actionMode, startActionMode);
        if (startActionMode == null) {
            textContextMenuSessionImpl.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider) {
        ActionMode actionMode;
        actionMode = androidTextContextMenuToolbarProvider.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this.this$0, this.$dataProvider, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((AndroidTextContextMenuToolbarProvider$showTextContextMenu$2) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        SnapshotStateObserver snapshotStateObserver;
        Looper myLooper;
        View view;
        Handler handler;
        ActionMode actionMode;
        Runnable runnable;
        View view2;
        Runnable runnable2;
        View view3;
        final TextActionModeCallback createActionModeCallback;
        View view4;
        View view5;
        Runnable runnable3;
        View view6;
        ActionMode actionMode2;
        Runnable runnable4;
        View view7;
        Runnable runnable5;
        View view8;
        int i = this.label;
        w01 w01Var = w01.a;
        try {
            if (i == 0) {
                p10.Q(obj);
                final AndroidTextContextMenuToolbarProvider.TextContextMenuSessionImpl textContextMenuSessionImpl = new AndroidTextContextMenuToolbarProvider.TextContextMenuSessionImpl();
                createActionModeCallback = this.this$0.createActionModeCallback(textContextMenuSessionImpl, this.$dataProvider);
                Looper myLooper2 = Looper.myLooper();
                view4 = this.this$0.view;
                Handler handler2 = view4.getHandler();
                Looper looper = handler2 != null ? handler2.getLooper() : null;
                AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.this$0;
                if (myLooper2 != looper) {
                    runnable3 = androidTextContextMenuToolbarProvider.startActionModeRunnable;
                    if (runnable3 == null) {
                        final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider2 = this.this$0;
                        Runnable runnable6 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.invokeSuspend$lambda$0(AndroidTextContextMenuToolbarProvider.this, createActionModeCallback, textContextMenuSessionImpl);
                            }
                        };
                        androidTextContextMenuToolbarProvider2.startActionModeRunnable = runnable6;
                        runnable3 = runnable6;
                    }
                    view6 = this.this$0.view;
                    view6.post(runnable3);
                } else {
                    TextToolbarHelper textToolbarHelper = TextToolbarHelper.INSTANCE;
                    view5 = androidTextContextMenuToolbarProvider.view;
                    ActionMode startActionMode = textToolbarHelper.startActionMode(view5, createActionModeCallback);
                    if (startActionMode == null) {
                        return w01Var;
                    }
                    androidTextContextMenuToolbarProvider.actionMode = startActionMode;
                }
                this.label = 1;
                Object awaitClose = textContextMenuSessionImpl.awaitClose(this);
                vn vnVar = vn.d;
                if (awaitClose == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            Looper looper2 = handler != null ? handler.getLooper() : null;
            AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider3 = this.this$0;
            if (myLooper != looper2) {
                runnable5 = androidTextContextMenuToolbarProvider3.finishActionModeRunnable;
                if (runnable5 == null) {
                    final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider4 = this.this$0;
                    Runnable runnable7 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.invokeSuspend$lambda$2(AndroidTextContextMenuToolbarProvider.this);
                        }
                    };
                    androidTextContextMenuToolbarProvider4.finishActionModeRunnable = runnable7;
                    runnable5 = runnable7;
                }
                view8 = this.this$0.view;
                view8.post(runnable5);
            } else {
                actionMode2 = androidTextContextMenuToolbarProvider3.actionMode;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            runnable4 = this.this$0.startActionModeRunnable;
            if (runnable4 != null) {
                view7 = this.this$0.view;
                view7.removeCallbacks(runnable4);
            }
            this.this$0.actionMode = null;
            return w01Var;
        } finally {
            snapshotStateObserver = this.this$0.snapshotStateObserver;
            snapshotStateObserver.clear();
            myLooper = Looper.myLooper();
            view = this.this$0.view;
            handler = view.getHandler();
            Looper looper3 = handler != null ? handler.getLooper() : null;
            AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider5 = this.this$0;
            if (myLooper != looper3) {
                runnable2 = androidTextContextMenuToolbarProvider5.finishActionModeRunnable;
                if (runnable2 == null) {
                    final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider6 = this.this$0;
                    Runnable runnable8 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.invokeSuspend$lambda$2(AndroidTextContextMenuToolbarProvider.this);
                        }
                    };
                    androidTextContextMenuToolbarProvider6.finishActionModeRunnable = runnable8;
                    runnable2 = runnable8;
                }
                view3 = this.this$0.view;
                view3.post(runnable2);
            } else {
                actionMode = androidTextContextMenuToolbarProvider5.actionMode;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            runnable = this.this$0.startActionModeRunnable;
            if (runnable != null) {
                view2 = this.this$0.view;
                view2.removeCallbacks(runnable);
            }
            this.this$0.actionMode = null;
        }
    }
}
