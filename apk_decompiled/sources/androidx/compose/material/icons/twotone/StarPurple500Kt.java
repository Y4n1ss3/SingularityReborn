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
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StarPurple500Kt {
    private static ImageVector _starPurple500;

    public static final ImageVector getStarPurple500(Icons.TwoTone twoTone) {
        ImageVector imageVector = _starPurple500;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.StarPurple500", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(12.0f, 8.89f, 12.94f, 12.0f, 2.82f);
        k.lineToRelative(-2.27f, 1.62f);
        k.lineToRelative(0.93f, 3.01f);
        k.lineTo(12.0f, 14.79f);
        k.lineToRelative(-2.42f, 1.84f);
        k.lineToRelative(0.93f, -3.01f);
        k.lineTo(8.24f, 12.0f);
        k.horizontalLineToRelative(2.82f);
        k.lineTo(12.0f, 8.89f);
        k.moveTo(12.0f, 2.0f);
        k.lineToRelative(-2.42f, 8.0f);
        k.horizontalLineTo(2.0f);
        k.lineToRelative(6.17f, 4.41f);
        k.lineTo(5.83f, 22.0f);
        k.lineTo(12.0f, 17.31f);
        k.lineTo(18.18f, 22.0f);
        k.lineToRelative(-2.35f, -7.59f);
        k.lineTo(22.0f, 10.0f);
        k.horizontalLineToRelative(-7.58f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(k, 12.0f, 2.0f, 12.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starPurple500 = build;
        build.getClass();
        return build;
    }
}
