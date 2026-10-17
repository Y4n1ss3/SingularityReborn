package defpackage;

import androidx.compose.material3.SwipeToDismissBoxDefaults;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.text.font.PlatformFontVariationSettings_androidKt;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class lf0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Density e;

    public /* synthetic */ lf0(Density density, int i) {
        this.d = i;
        this.e = density;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        CharSequence androidString$lambda$0;
        float _get_positionalThreshold_$lambda$2$lambda$1$lambda$0;
        int i = this.d;
        Density density = this.e;
        switch (i) {
            case 0:
                androidString$lambda$0 = PlatformFontVariationSettings_androidKt.toAndroidString$lambda$0(density, (FontVariation.Setting) obj);
                return androidString$lambda$0;
            default:
                _get_positionalThreshold_$lambda$2$lambda$1$lambda$0 = SwipeToDismissBoxDefaults._get_positionalThreshold_$lambda$2$lambda$1$lambda$0(density, ((Float) obj).floatValue());
                return Float.valueOf(_get_positionalThreshold_$lambda$2$lambda$1$lambda$0);
        }
    }
}
