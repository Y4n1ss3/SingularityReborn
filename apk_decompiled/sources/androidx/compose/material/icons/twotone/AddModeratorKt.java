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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddModeratorKt {
    private static ImageVector _addModerator;

    public static final ImageVector getAddModerator(Icons.TwoTone twoTone) {
        ImageVector imageVector = _addModerator;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AddModerator", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(12.0f, 4.14f, 6.0f, 6.39f, 4.7f);
        s.curveToRelative(0.0f, 3.33f, 1.76f, 6.44f, 4.33f, 8.04f);
        s.curveToRelative(-1.56f, -4.89f, 2.5f, -9.8f, 7.67f, -9.05f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.k(s, 6.39f, 12.0f, 4.14f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.33f, 19.13f);
        b.curveTo(7.76f, 17.53f, 6.0f, 14.42f, 6.0f, 11.09f);
        b.verticalLineToRelative(-4.7f);
        b.lineToRelative(6.0f, -2.25f);
        b.lineToRelative(6.0f, 2.25f);
        b.verticalLineToRelative(3.69f);
        b.curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2.0f, 0.6f);
        b.verticalLineTo(5.0f);
        b.lineToRelative(-8.0f, -3.0f);
        b.lineTo(4.0f, 5.0f);
        b.verticalLineToRelative(6.09f);
        b.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        b.curveToRelative(0.03f, -0.01f, 0.05f, -0.02f, 0.08f, -0.02f);
        b.curveTo(11.29f, 21.19f, 10.68f, 20.22f, 10.33f, 19.13f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(17.0f, 12.0f);
        b2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b2.reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f);
        af0.r(b2, 20.0f, 17.5f, -2.5f, 20.0f);
        af0.z(b2, -1.0f, -2.5f, 14.0f, -1.0f);
        af0.q(b2, 2.5f, 14.0f, 1.0f, 2.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(b2, 20.0f, 17.5f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addModerator = build;
        build.getClass();
        return build;
    }
}
