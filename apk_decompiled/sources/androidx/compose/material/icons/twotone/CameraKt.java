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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CameraKt {
    private static ImageVector _camera;

    public static final ImageVector getCamera(Icons.TwoTone twoTone) {
        ImageVector imageVector = _camera;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Camera", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.9f, 19.91f);
        b.curveToRelative(0.36f, 0.05f, 0.72f, 0.09f, 1.1f, 0.09f);
        b.curveToRelative(2.18f, 0.0f, 4.16f, -0.88f, 5.61f, -2.3f);
        bv.o(b, 14.89f, 13.0f, -3.99f, 6.91f);
        b.moveTo(9.86f, 19.7f);
        b.lineToRelative(2.71f, -4.7f);
        b.lineTo(4.59f, 15.0f);
        b.curveToRelative(0.93f, 2.28f, 2.87f, 4.03f, 5.27f, 4.7f);
        k4.r(b, 8.54f, 12.0f, 5.7f, 7.09f);
        b.curveTo(4.64f, 8.45f, 4.0f, 10.15f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, 0.69f, 0.1f, 1.36f, 0.26f, 2.0f);
        uo.w(b, 5.43f, -1.15f, -2.0f);
        b.moveTo(18.3f, 16.91f);
        b.curveTo(19.36f, 15.55f, 20.0f, 13.85f, 20.0f, 12.0f);
        b.curveToRelative(0.0f, -0.69f, -0.1f, -1.36f, -0.26f, -2.0f);
        uo.w(b, -5.43f, 3.99f, 6.91f);
        b.moveTo(13.73f, 9.0f);
        b.horizontalLineToRelative(5.68f);
        b.curveToRelative(-0.93f, -2.28f, -2.88f, -4.04f, -5.28f, -4.7f);
        uf.j(b, 11.42f, 9.0f, 2.31f);
        b.moveTo(10.27f, 9.0f);
        b.lineToRelative(2.83f, -4.92f);
        b.curveTo(12.74f, 4.03f, 12.37f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(-2.18f, 0.0f, -4.16f, 0.88f, -5.6f, 2.3f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(b, 9.12f, 11.0f, 1.15f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 22.0f);
        b2.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        b2.curveToRelative(0.0f, -4.75f, -3.31f, -8.72f, -7.75f, -9.74f);
        b2.lineToRelative(-0.08f, -0.04f);
        b2.lineToRelative(-0.01f, 0.02f);
        b2.curveTo(13.46f, 2.09f, 12.74f, 2.0f, 12.0f, 2.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b2.close();
        b2.moveTo(12.0f, 20.0f);
        b2.curveToRelative(-0.38f, 0.0f, -0.74f, -0.04f, -1.1f, -0.09f);
        b2.lineTo(14.89f, 13.0f);
        b2.lineToRelative(2.72f, 4.7f);
        b2.curveTo(16.16f, 19.12f, 14.18f, 20.0f, 12.0f, 20.0f);
        b2.close();
        b2.moveTo(20.0f, 12.0f);
        b2.curveToRelative(0.0f, 1.85f, -0.64f, 3.55f, -1.7f, 4.91f);
        b2.lineToRelative(-4.0f, -6.91f);
        b2.horizontalLineToRelative(5.43f);
        b2.curveToRelative(0.17f, 0.64f, 0.27f, 1.31f, 0.27f, 2.0f);
        af0.l(b2, 19.41f, 9.0f, -7.99f);
        b2.lineToRelative(2.71f, -4.7f);
        b2.curveToRelative(2.4f, 0.66f, 4.35f, 2.42f, 5.28f, 4.7f);
        b2.close();
        b2.moveTo(12.0f, 4.0f);
        b2.curveToRelative(0.37f, 0.0f, 0.74f, 0.03f, 1.1f, 0.08f);
        b2.lineTo(10.27f, 9.0f);
        b2.lineToRelative(-1.15f, 2.0f);
        b2.lineTo(6.4f, 6.3f);
        b2.curveTo(7.84f, 4.88f, 9.82f, 4.0f, 12.0f, 4.0f);
        b2.close();
        b2.moveTo(4.0f, 12.0f);
        b2.curveToRelative(0.0f, -1.85f, 0.64f, -3.55f, 1.7f, -4.91f);
        b2.lineTo(8.54f, 12.0f);
        b2.lineToRelative(1.15f, 2.0f);
        b2.lineTo(4.26f, 14.0f);
        b2.curveTo(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
        af0.l(b2, 10.27f, 15.0f, 2.3f);
        b2.lineToRelative(-2.71f, 4.7f);
        b2.curveToRelative(-2.4f, -0.67f, -4.35f, -2.42f, -5.28f, -4.7f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(b2, 5.69f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _camera = build;
        build.getClass();
        return build;
    }
}
