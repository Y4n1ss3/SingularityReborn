package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DisabledByDefaultKt {
    private static ImageVector _disabledByDefault;

    public static final ImageVector getDisabledByDefault(Icons.Outlined outlined) {
        ImageVector imageVector = _disabledByDefault;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DisabledByDefault", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(19.0f, 19.0f, 5.0f, 5.0f, 14.0f);
        kf0.D(f, 19.0f, 3.0f, 3.0f, 18.0f);
        kf0.v(f, 18.0f, 3.0f, 3.0f);
        f.moveTo(17.0f, 15.59f);
        f.lineTo(15.59f, 17.0f);
        f.lineTo(12.0f, 13.41f);
        f.lineTo(8.41f, 17.0f);
        f.lineTo(7.0f, 15.59f);
        f.lineTo(10.59f, 12.0f);
        f.lineTo(7.0f, 8.41f);
        f.lineTo(8.41f, 7.0f);
        f.lineTo(12.0f, 10.59f);
        f.lineTo(15.59f, 7.0f);
        f.lineTo(17.0f, 8.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(f, 13.41f, 12.0f, 17.0f, 15.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _disabledByDefault = build;
        build.getClass();
        return build;
    }
}
