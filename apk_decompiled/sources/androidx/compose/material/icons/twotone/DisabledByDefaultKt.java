package androidx.compose.material.icons.twotone;

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
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DisabledByDefaultKt {
    private static ImageVector _disabledByDefault;

    public static final ImageVector getDisabledByDefault(Icons.TwoTone twoTone) {
        ImageVector imageVector = _disabledByDefault;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DisabledByDefault", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(5.0f, 5.0f, 14.0f, 14.0f, 5.0f);
        k4.w(w, 5.0f, 17.0f, 15.59f);
        w.lineTo(15.59f, 17.0f);
        w.lineTo(12.0f, 13.41f);
        w.lineTo(8.41f, 17.0f);
        w.lineTo(7.0f, 15.59f);
        w.lineTo(10.59f, 12.0f);
        w.lineTo(7.0f, 8.41f);
        w.lineTo(8.41f, 7.0f);
        w.lineTo(12.0f, 10.59f);
        w.lineTo(15.59f, 7.0f);
        w.lineTo(17.0f, 8.41f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(w, 13.41f, 12.0f, 17.0f, 15.59f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
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
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(f, 13.41f, 12.0f, 17.0f, 15.59f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _disabledByDefault = build;
        build.getClass();
        return build;
    }
}
