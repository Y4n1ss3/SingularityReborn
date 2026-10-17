package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.compose.runtime.Composer;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextContextMenuHelperApi28 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;

    public /* synthetic */ d(TextContextMenuHelperApi28 textContextMenuHelperApi28, Object obj, int i, int i2) {
        this.d = i2;
        this.e = textContextMenuHelperApi28;
        this.f = obj;
        this.g = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 IconBox$lambda$1;
        w01 IconBox$lambda$2;
        w01 IconBox$lambda$4;
        int i = this.d;
        int i2 = this.g;
        Object obj3 = this.f;
        TextContextMenuHelperApi28 textContextMenuHelperApi28 = this.e;
        switch (i) {
            case 0:
                IconBox$lambda$1 = TextContextMenuHelperApi28.IconBox$lambda$1(textContextMenuHelperApi28, (Icon) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return IconBox$lambda$1;
            case 1:
                IconBox$lambda$2 = TextContextMenuHelperApi28.IconBox$lambda$2(textContextMenuHelperApi28, (Icon) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return IconBox$lambda$2;
            default:
                IconBox$lambda$4 = TextContextMenuHelperApi28.IconBox$lambda$4(textContextMenuHelperApi28, (Drawable) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return IconBox$lambda$4;
        }
    }
}
