package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import defpackage.d41;
import defpackage.f2;
import defpackage.hm;
import defpackage.i2;
import defpackage.iy;
import defpackage.j6;
import defpackage.ji0;
import defpackage.k6;
import defpackage.ky;
import defpackage.q10;
import defpackage.v4;
import defpackage.vn;
import defpackage.w01;
import defpackage.zg;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidTextContextMenuToolbarProvider implements TextContextMenuProvider {
    public static final int $stable = 8;
    private ActionMode actionMode;
    private final ky callbackInjector;
    private final iy coordinatesProvider;
    private Runnable finishActionModeRunnable;
    private Runnable startActionModeRunnable;
    private final View view;
    private final MutatorMutex mutatorMutex = new MutatorMutex();
    private final SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new k6(this, 0));
    private final ky onDataChange = new k6(this, 1);
    private final ky onPositionChange = new k6(this, 2);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TextActionModeCallbackImpl implements TextActionModeCallback {
        private final iy dataBuilder;
        private iy positioner;
        private TextContextMenuData previousData;
        private final TextContextMenuSession session;
        private final View view;

        public TextActionModeCallbackImpl(TextContextMenuSession textContextMenuSession, iy iyVar, iy iyVar2, View view) {
            this.session = textContextMenuSession;
            this.dataBuilder = iyVar;
            this.positioner = iyVar2;
            this.view = view;
        }

        private final boolean updateMenuItems(Menu menu) {
            TextContextMenuData textContextMenuData = (TextContextMenuData) this.dataBuilder.invoke();
            int i = 0;
            if (q10.b(textContextMenuData, this.previousData)) {
                return false;
            }
            menu.clear();
            List<TextContextMenuComponent> components = textContextMenuData.getComponents();
            int size = components.size();
            int i2 = 1;
            int i3 = 1;
            for (int i4 = 0; i4 < size; i4++) {
                TextContextMenuComponent textContextMenuComponent = components.get(i4);
                if (textContextMenuComponent instanceof TextContextMenuItem) {
                    int i5 = i2 + 1;
                    TextContextMenuItem textContextMenuItem = (TextContextMenuItem) textContextMenuComponent;
                    MenuItem add = menu.add(i3, i2, i2, textContextMenuItem.getLabel());
                    add.setShowAsAction(2);
                    add.setOnMenuItemClickListener(new a(i, textContextMenuItem, this));
                    i2 = i5;
                } else if (textContextMenuComponent instanceof TextContextMenuTextClassificationItem) {
                    TextContextMenuTextClassificationItem textContextMenuTextClassificationItem = (TextContextMenuTextClassificationItem) textContextMenuComponent;
                    TextToolbarHelperApi28.INSTANCE.addMenuItem(menu, i2, this.view.getContext(), textContextMenuTextClassificationItem.getTextClassification(), textContextMenuTextClassificationItem.getIndex());
                    i2++;
                } else if (textContextMenuComponent instanceof TextContextMenuSeparator) {
                    i3++;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean updateMenuItems$lambda$0$0(TextContextMenuComponent textContextMenuComponent, TextActionModeCallbackImpl textActionModeCallbackImpl, MenuItem menuItem) {
            ((TextContextMenuItem) textContextMenuComponent).getOnClick().invoke(textActionModeCallbackImpl.session);
            return true;
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            updateMenuItems(menu);
            return menu.size() > 0;
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.session.close();
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public Rect onGetContentRect(ActionMode actionMode, View view) {
            return (Rect) this.positioner.invoke();
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return updateMenuItems(menu);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TextContextMenuSessionImpl implements TextContextMenuSession {
        private final zg channel = d41.b(0, 7, null);

        public final Object awaitClose(hm hmVar) {
            Object i = this.channel.i(hmVar);
            return i == vn.d ? i : w01.a;
        }

        @Override // androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession
        public void close() {
            this.channel.m(w01.a);
        }
    }

    public AndroidTextContextMenuToolbarProvider(View view, ky kyVar, iy iyVar) {
        this.view = view;
        this.callbackInjector = kyVar;
        this.coordinatesProvider = iyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextActionModeCallback createActionModeCallback(TextContextMenuSessionImpl textContextMenuSessionImpl, TextContextMenuDataProvider textContextMenuDataProvider) {
        TextActionModeCallback textActionModeCallback;
        TextActionModeCallbackImpl textActionModeCallbackImpl = new TextActionModeCallbackImpl(textContextMenuSessionImpl, new j6(this, textContextMenuDataProvider, 0), new j6(this, textContextMenuDataProvider, 1), this.view);
        ky kyVar = this.callbackInjector;
        return (kyVar == null || (textActionModeCallback = (TextActionModeCallback) kyVar.invoke(textActionModeCallbackImpl)) == null) ? textActionModeCallbackImpl : textActionModeCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect observeAndGetBounds(TextContextMenuDataProvider textContextMenuDataProvider) {
        return (Rect) observeReadsAndGet("positioner", this.onPositionChange, new j6(this, textContextMenuDataProvider, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect observeAndGetBounds$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextContextMenuDataProvider textContextMenuDataProvider) {
        Object invoke = androidTextContextMenuToolbarProvider.coordinatesProvider.invoke();
        if (!((LayoutCoordinates) invoke).isAttached()) {
            invoke = null;
        }
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) invoke;
        return layoutCoordinates == null ? Rect.Companion.getZero() : textContextMenuDataProvider.contentBounds(layoutCoordinates).m4553translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextContextMenuData observeAndGetData(TextContextMenuDataProvider textContextMenuDataProvider) {
        return (TextContextMenuData) observeReadsAndGet("dataBuilder", this.onDataChange, new i2(textContextMenuDataProvider, 4));
    }

    private final <T, S> T observeReadsAndGet(S s, ky kyVar, iy iyVar) {
        ji0 ji0Var = new ji0();
        this.snapshotStateObserver.observeReads(s, kyVar, new v4(1, ji0Var, iyVar));
        T t = (T) ji0Var.d;
        if (t != null) {
            return t;
        }
        q10.H("result");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 observeReadsAndGet$lambda$0(ji0 ji0Var, iy iyVar) {
        ji0Var.d = iyVar.invoke();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onDataChange$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, Object obj) {
        ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
        if (actionMode != null) {
            actionMode.invalidate();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onPositionChange$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, Object obj) {
        ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
        if (actionMode != null) {
            TextToolbarHelper.INSTANCE.invalidateContentRect(actionMode);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 snapshotStateObserver$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, iy iyVar) {
        Handler handler = androidTextContextMenuToolbarProvider.view.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            iyVar.invoke();
        } else {
            Handler handler2 = androidTextContextMenuToolbarProvider.view.getHandler();
            if (handler2 != null) {
                handler2.post(new f2(2, iyVar));
            }
        }
        return w01.a;
    }

    public final void dispose() {
        this.snapshotStateObserver.stop();
        this.snapshotStateObserver.clear();
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider
    public Object showTextContextMenu(TextContextMenuDataProvider textContextMenuDataProvider, hm hmVar) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this, textContextMenuDataProvider, null), hmVar, 1, null);
        return mutate$default == vn.d ? mutate$default : w01.a;
    }

    public final void start() {
        this.snapshotStateObserver.start();
    }
}
