package androidx.compose.material.icons.sharp;

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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Face3Kt {
    private static ImageVector _face3;

    public static final ImageVector getFace3(Icons.Sharp sharp) {
        ImageVector imageVector = _face3;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Face3", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(9.0f, 13.0f, -1.25f, 0.0f);
        b.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        b.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(15.0f, 13.0f, -1.25f, 0.0f);
        b2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        b2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(22.91f, 11.96f);
        b3.curveToRelative(-0.54f, -5.93f, -5.75f, -10.41f, -11.8f, -9.92f);
        b3.curveTo(5.73f, 2.46f, 1.55f, 6.94f, 1.06f, 12.32f);
        b3.lineTo(0.0f, 24.0f);
        b3.horizontalLineToRelative(24.0f);
        b3.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        uo.l(b3, 22.91f, 11.96f, 4.54f, 9.13f);
        b3.curveTo(5.41f, 9.68f, 6.43f, 10.0f, 7.5f, 10.0f);
        b3.curveTo(9.36f, 10.0f, 11.0f, 9.07f, 12.0f, 7.65f);
        b3.curveTo(13.0f, 9.07f, 14.64f, 10.0f, 16.5f, 10.0f);
        b3.curveToRelative(1.07f, 0.0f, 2.09f, -0.32f, 2.96f, -0.87f);
        b3.curveTo(19.8f, 10.02f, 20.0f, 10.99f, 20.0f, 12.0f);
        b3.curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        b3.reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f);
        b3.curveTo(4.0f, 10.99f, 4.2f, 10.02f, 4.54f, 9.13f);
        b3.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _face3 = build;
        build.getClass();
        return build;
    }
}
