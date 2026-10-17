package defpackage;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class bt implements jq {
    public final /* synthetic */ s40 d;

    public bt(EmojiCompatInitializer emojiCompatInitializer, s40 s40Var) {
        this.d = s40Var;
    }

    @Override // defpackage.jq
    public final void onResume(y40 y40Var) {
        jl.a(Looper.getMainLooper()).postDelayed(new et(), 500L);
        this.d.b(this);
    }
}
