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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WhatshotKt {
    private static ImageVector _whatshot;

    public static final ImageVector getWhatshot(Icons.Outlined outlined) {
        ImageVector imageVector = _whatshot;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Whatshot", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.57f, 13.16f);
        b.curveToRelative(-1.36f, 0.28f, -2.17f, 1.16f, -2.17f, 2.41f);
        b.curveToRelative(0.0f, 1.34f, 1.11f, 2.42f, 2.49f, 2.42f);
        b.curveToRelative(2.05f, 0.0f, 3.71f, -1.66f, 3.71f, -3.71f);
        b.curveToRelative(0.0f, -1.07f, -0.15f, -2.12f, -0.46f, -3.12f);
        b.curveToRelative(-0.79f, 1.07f, -2.2f, 1.72f, -3.57f, 2.0f);
        b.close();
        b.moveTo(13.5f, 0.67f);
        b.reflectiveCurveToRelative(0.74f, 2.65f, 0.74f, 4.8f);
        b.curveToRelative(0.0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f);
        b.curveToRelative(-2.07f, 0.0f, -3.63f, -1.67f, -3.63f, -3.73f);
        b.lineToRelative(0.03f, -0.36f);
        b.curveTo(5.21f, 7.51f, 4.0f, 10.62f, 4.0f, 14.0f);
        b.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        b.curveTo(20.0f, 8.61f, 17.41f, 3.8f, 13.5f, 0.67f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        b.curveToRelative(0.0f, -1.53f, 0.3f, -3.04f, 0.86f, -4.43f);
        b.curveToRelative(1.01f, 1.01f, 2.41f, 1.63f, 3.97f, 1.63f);
        b.curveToRelative(2.66f, 0.0f, 4.75f, -1.83f, 5.28f, -4.43f);
        b.curveTo(17.34f, 8.97f, 18.0f, 11.44f, 18.0f, 14.0f);
        b.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _whatshot = build;
        build.getClass();
        return build;
    }
}
