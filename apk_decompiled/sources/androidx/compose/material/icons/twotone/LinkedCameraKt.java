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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinkedCameraKt {
    private static ImageVector _linkedCamera;

    public static final ImageVector getLinkedCamera(Icons.TwoTone twoTone) {
        ImageVector imageVector = _linkedCamera;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LinkedCamera", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 20.0f, 4.0f, 20.0f);
        i.lineTo(4.0f, 8.0f);
        i.horizontalLineToRelative(4.05f);
        i.lineToRelative(1.83f, -2.0f);
        i.lineTo(15.0f, 6.0f);
        i.lineTo(15.0f, 4.0f);
        i.lineTo(9.0f, 4.0f);
        i.lineTo(7.17f, 6.0f);
        i.lineTo(4.0f, 6.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r6.m(i, 22.0f, 9.0f, -2.0f, 11.0f);
        i.moveTo(16.0f, 2.0f);
        i.verticalLineToRelative(1.33f);
        i.curveToRelative(2.58f, 0.0f, 4.66f, 2.09f, 4.67f, 4.66f);
        i.lineTo(22.0f, 7.99f);
        i.curveTo(21.99f, 4.68f, 19.31f, 2.0f, 16.0f, 2.0f);
        k4.r(i, 16.0f, 4.67f, 16.0f, 6.0f);
        i.curveToRelative(1.11f, 0.0f, 1.99f, 0.89f, 2.0f, 1.99f);
        i.horizontalLineToRelative(1.33f);
        i.curveToRelative(-0.01f, -1.84f, -1.49f, -3.32f, -3.33f, -3.32f);
        i.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.98f, 10.01f);
        b.curveToRelative(-0.13f, -0.09f, -0.26f, -0.18f, -0.39f, -0.26f);
        b.curveToRelative(0.14f, 0.08f, 0.27f, 0.17f, 0.39f, 0.26f);
        b.close();
        b.moveTo(17.0f, 9.0f);
        b.curveToRelative(0.0f, -0.37f, -0.11f, -0.71f, -0.28f, -1.01f);
        b.curveToRelative(-0.18f, -0.3f, -0.43f, -0.55f, -0.73f, -0.72f);
        b.curveTo(15.7f, 7.1f, 15.36f, 7.0f, 15.0f, 7.0f);
        b.lineTo(15.0f, 6.0f);
        b.lineTo(9.88f, 6.0f);
        b.lineTo(8.05f, 8.0f);
        af0.m(b, 4.0f, 8.0f, 12.0f, 16.0f);
        uf.j(b, 20.0f, 9.0f, -3.0f);
        b.moveTo(12.0f, 19.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        b.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        b.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -2.24f, 5.0f, -5.0f, 5.0f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 9.0f);
        b2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b2.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        b2.close();
        b2.moveTo(12.0f, 17.0f);
        b2.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        b2.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        b2.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b2, -1.35f, 3.0f, -3.0f, 3.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkedCamera = build;
        build.getClass();
        return build;
    }
}
