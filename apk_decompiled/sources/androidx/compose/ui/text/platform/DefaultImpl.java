package androidx.compose.ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import defpackage.at;
import defpackage.ys;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class DefaultImpl implements EmojiCompatStatusDelegate {
    private State<Boolean> loadState;

    public DefaultImpl() {
        this.loadState = at.d() ? getFontLoadState() : null;
    }

    private final State<Boolean> getFontLoadState() {
        at a = at.a();
        if (a.c() == 1) {
            return new ImmutableBool(true);
        }
        final MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        a.h(new ys() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
            @Override // defpackage.ys
            public void onFailed(Throwable th) {
                ImmutableBool immutableBool;
                DefaultImpl defaultImpl = this;
                immutableBool = EmojiCompatStatus_androidKt.Falsey;
                defaultImpl.loadState = immutableBool;
            }

            @Override // defpackage.ys
            public void onInitialized() {
                mutableStateOf$default.setValue(Boolean.TRUE);
                this.loadState = new ImmutableBool(true);
            }
        });
        return mutableStateOf$default;
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public State<Boolean> getFontLoaded() {
        ImmutableBool immutableBool;
        State<Boolean> state = this.loadState;
        if (state != null) {
            state.getClass();
            return state;
        }
        if (!at.d()) {
            immutableBool = EmojiCompatStatus_androidKt.Falsey;
            return immutableBool;
        }
        State<Boolean> fontLoadState = getFontLoadState();
        this.loadState = fontLoadState;
        fontLoadState.getClass();
        return fontLoadState;
    }
}
