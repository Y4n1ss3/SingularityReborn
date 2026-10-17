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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddModeratorKt {
    private static ImageVector _addModerator;

    public static final ImageVector getAddModerator(Icons.Rounded rounded) {
        ImageVector imageVector = _addModerator;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AddModerator", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.0f, 10.0f);
        b.curveToRelative(1.08f, 0.0f, 2.09f, 0.25f, 3.0f, 0.68f);
        b.verticalLineToRelative(-4.3f);
        b.curveToRelative(0.0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f);
        b.lineToRelative(-6.0f, -2.25f);
        b.curveToRelative(-0.45f, -0.17f, -0.95f, -0.17f, -1.4f, 0.0f);
        b.lineToRelative(-6.0f, 2.25f);
        b.curveTo(4.52f, 4.81f, 4.0f, 5.55f, 4.0f, 6.39f);
        b.verticalLineToRelative(4.7f);
        b.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        b.curveToRelative(0.03f, -0.01f, 0.05f, -0.02f, 0.08f, -0.02f);
        b.curveTo(10.8f, 20.71f, 10.0f, 18.95f, 10.0f, 17.0f);
        b.curveTo(10.0f, 13.13f, 13.13f, 10.0f, 17.0f, 10.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(17.0f, 12.0f);
        b2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b2.reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f);
        r6.B(b2, 19.5f, 17.5f, -2.0f, 2.0f);
        b2.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        b2.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        b2.verticalLineToRelative(-2.0f);
        b2.horizontalLineToRelative(-2.0f);
        b2.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        b2.reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f);
        b2.horizontalLineToRelative(2.0f);
        b2.verticalLineToRelative(-2.0f);
        b2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b2.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        b2.verticalLineToRelative(2.0f);
        b2.horizontalLineToRelative(2.0f);
        b2.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b2, 19.78f, 17.5f, 19.5f, 17.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addModerator = build;
        build.getClass();
        return build;
    }
}
