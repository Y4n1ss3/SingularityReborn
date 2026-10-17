package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PentagonKt {
    private static ImageVector _pentagon;

    public static final ImageVector getPentagon(Icons.Rounded rounded) {
        ImageVector imageVector = _pentagon;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pentagon", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(2.47f, 10.42f, 3.07f, 9.22f);
        e.curveTo(5.82f, 20.45f, 6.58f, 21.0f, 7.44f, 21.0f);
        e.horizontalLineToRelative(9.12f);
        e.curveToRelative(0.86f, 0.0f, 1.63f, -0.55f, 1.9f, -1.37f);
        e.lineToRelative(3.07f, -9.22f);
        e.curveToRelative(0.28f, -0.84f, -0.03f, -1.76f, -0.75f, -2.27f);
        e.lineTo(13.15f, 2.8f);
        e.curveToRelative(-0.69f, -0.48f, -1.61f, -0.48f, -2.29f, 0.0f);
        e.lineTo(3.22f, 8.14f);
        e.curveTo(2.5f, 8.65f, 2.19f, 9.58f, 2.47f, 10.42f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pentagon = build;
        build.getClass();
        return build;
    }
}
