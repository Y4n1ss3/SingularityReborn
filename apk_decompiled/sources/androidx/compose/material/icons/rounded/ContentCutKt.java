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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContentCutKt {
    private static ImageVector _contentCut;

    public static final ImageVector getContentCut(Icons.Rounded rounded) {
        ImageVector imageVector = _contentCut;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ContentCut", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.64f, 7.64f);
        b.curveToRelative(0.29f, -0.62f, 0.42f, -1.33f, 0.34f, -2.09f);
        b.curveToRelative(-0.19f, -1.73f, -1.54f, -3.2f, -3.26f, -3.49f);
        b.curveToRelative(-2.77f, -0.48f, -5.14f, 1.89f, -4.66f, 4.65f);
        b.curveToRelative(0.3f, 1.72f, 1.76f, 3.07f, 3.49f, 3.26f);
        b.curveToRelative(0.76f, 0.08f, 1.46f, -0.05f, 2.09f, -0.34f);
        b.lineTo(10.0f, 12.0f);
        b.lineToRelative(-2.36f, 2.36f);
        b.curveToRelative(-0.62f, -0.29f, -1.33f, -0.42f, -2.09f, -0.34f);
        b.curveToRelative(-1.73f, 0.19f, -3.2f, 1.54f, -3.49f, 3.26f);
        b.curveToRelative(-0.48f, 2.77f, 1.89f, 5.13f, 4.65f, 4.65f);
        b.curveToRelative(1.72f, -0.3f, 3.07f, -1.76f, 3.26f, -3.49f);
        b.curveToRelative(0.08f, -0.76f, -0.05f, -1.46f, -0.34f, -2.09f);
        b.lineTo(12.0f, 14.0f);
        b.lineToRelative(7.59f, 7.59f);
        b.curveToRelative(0.89f, 0.89f, 2.41f, 0.26f, 2.41f, -1.0f);
        b.verticalLineToRelative(-0.01f);
        b.curveToRelative(0.0f, -0.37f, -0.15f, -0.73f, -0.41f, -1.0f);
        uo.l(b, 9.64f, 7.64f, 6.0f, 8.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.close();
        b.moveTo(6.0f, 20.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 12.5f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        b.reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        b.reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f);
        k4.r(b, 19.59f, 2.41f, 13.0f, 9.0f);
        b.lineToRelative(2.0f, 2.0f);
        b.lineToRelative(6.59f, -6.59f);
        b.curveToRelative(0.26f, -0.26f, 0.41f, -0.62f, 0.41f, -1.0f);
        b.lineTo(22.0f, 3.4f);
        b.curveToRelative(0.0f, -1.25f, -1.52f, -1.88f, -2.41f, -0.99f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contentCut = build;
        build.getClass();
        return build;
    }
}
