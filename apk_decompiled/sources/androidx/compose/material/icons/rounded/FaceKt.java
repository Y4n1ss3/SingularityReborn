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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FaceKt {
    private static ImageVector _face;

    public static final ImageVector getFace(Icons.Rounded rounded) {
        ImageVector imageVector = _face;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Face", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.25f, 13.0f);
        b.curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f);
        b.reflectiveCurveTo(7.75f, 13.69f, 7.75f, 13.0f);
        b.reflectiveCurveTo(8.31f, 11.75f, 9.0f, 11.75f);
        b.reflectiveCurveTo(10.25f, 12.31f, 10.25f, 13.0f);
        b.close();
        b.moveTo(15.0f, 11.75f);
        b.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        b.reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f);
        b.reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f);
        b.reflectiveCurveTo(15.69f, 11.75f, 15.0f, 11.75f);
        b.close();
        b.moveTo(22.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f);
        b.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        b.reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f);
        b.reflectiveCurveTo(22.0f, 6.48f, 22.0f, 12.0f);
        b.close();
        b.moveTo(20.0f, 12.0f);
        b.curveToRelative(0.0f, -0.78f, -0.12f, -1.53f, -0.33f, -2.24f);
        b.curveTo(18.97f, 9.91f, 18.25f, 10.0f, 17.5f, 10.0f);
        b.curveToRelative(-3.13f, 0.0f, -5.92f, -1.44f, -7.76f, -3.69f);
        b.curveTo(8.69f, 8.87f, 6.6f, 10.88f, 4.0f, 11.86f);
        b.curveTo(4.01f, 11.9f, 4.0f, 11.95f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 20.0f, 16.41f, 20.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _face = build;
        build.getClass();
        return build;
    }
}
