package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CameraswitchKt {
    private static ImageVector _cameraswitch;

    public static final ImageVector getCameraswitch(Icons.Filled filled) {
        ImageVector imageVector = _cameraswitch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Cameraswitch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(16.0f, 7.0f, -1.0f, -1.0f, -1.0f);
        kf0.A(i, -4.0f, 9.0f, 7.0f, 8.0f);
        i.curveTo(6.9f, 7.0f, 6.0f, 7.9f, 6.0f, 9.0f);
        i.verticalLineToRelative(6.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(8.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(9.0f);
        i.curveTo(18.0f, 7.9f, 17.1f, 7.0f, 16.0f, 7.0f);
        i.close();
        i.moveTo(12.0f, 14.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        i.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        i.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        i.curveTo(14.0f, 13.1f, 13.1f, 14.0f, 12.0f, 14.0f);
        i.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(8.57f, 0.51f, 4.48f, 4.48f, 2.04f);
        j.curveToRelative(4.72f, 0.47f, 8.48f, 4.23f, 8.95f, 8.95f);
        j.curveToRelative(0.0f, 0.0f, 2.0f, 0.0f, 2.0f, 0.0f);
        j.curveTo(23.34f, 3.02f, 15.49f, -1.59f, 8.57f, 0.51f);
        j.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.95f, 21.96f);
        b.curveTo(6.23f, 21.49f, 2.47f, 17.73f, 2.0f, 13.01f);
        b.curveToRelative(0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f);
        b.curveToRelative(0.66f, 7.97f, 8.51f, 12.58f, 15.43f, 10.48f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(b, -4.48f, -4.48f, 21.96f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cameraswitch = build;
        build.getClass();
        return build;
    }
}
