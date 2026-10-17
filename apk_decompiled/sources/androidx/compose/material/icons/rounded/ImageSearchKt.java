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
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImageSearchKt {
    private static ImageVector _imageSearch;

    public static final ImageVector getImageSearch(Icons.Rounded rounded) {
        ImageVector imageVector = _imageSearch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ImageSearch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(18.0f, 15.0f, 4.0f);
        h.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        h.lineTo(5.0f, 20.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        h.lineTo(4.0f, 7.0f);
        h.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        h.horizontalLineToRelative(3.02f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        h.lineTo(4.0f, 4.0f);
        h.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        h.verticalLineToRelative(14.0f);
        h.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        h.horizontalLineToRelative(14.0f);
        h.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.verticalLineToRelative(-5.0f);
        h.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        k4.r(h, 15.5f, 18.0f, 6.52f, 18.0f);
        h.curveToRelative(-0.42f, 0.0f, -0.65f, -0.48f, -0.39f, -0.81f);
        h.lineToRelative(1.74f, -2.23f);
        h.curveToRelative(0.2f, -0.25f, 0.58f, -0.26f, 0.78f, -0.01f);
        h.lineToRelative(1.56f, 1.88f);
        h.lineToRelative(2.35f, -3.02f);
        h.curveToRelative(0.2f, -0.26f, 0.6f, -0.26f, 0.79f, 0.01f);
        h.lineToRelative(2.55f, 3.39f);
        h.curveToRelative(0.25f, 0.32f, 0.01f, 0.79f, -0.4f, 0.79f);
        h.close();
        h.moveTo(19.3f, 8.89f);
        h.curveToRelative(0.48f, -0.77f, 0.75f, -1.67f, 0.69f, -2.66f);
        h.curveToRelative(-0.13f, -2.15f, -1.84f, -3.97f, -3.97f, -4.2f);
        h.curveTo(13.3f, 1.73f, 11.0f, 3.84f, 11.0f, 6.5f);
        h.curveToRelative(0.0f, 2.49f, 2.01f, 4.5f, 4.49f, 4.5f);
        h.curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f);
        h.lineToRelative(2.41f, 2.41f);
        h.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        h.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        fc.B(h, -2.41f, -2.4f, 15.5f, 9.0f);
        h.curveTo(14.12f, 9.0f, 13.0f, 7.88f, 13.0f, 6.5f);
        h.reflectiveCurveTo(14.12f, 4.0f, 15.5f, 4.0f);
        h.reflectiveCurveTo(18.0f, 5.12f, 18.0f, 6.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(h, 16.88f, 9.0f, 15.5f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _imageSearch = build;
        build.getClass();
        return build;
    }
}
