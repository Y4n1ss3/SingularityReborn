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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BrowseGalleryKt {
    private static ImageVector _browseGallery;

    public static final ImageVector getBrowseGallery(Icons.Rounded rounded) {
        ImageVector imageVector = _browseGallery;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BrowseGallery", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.0f, 3.0f);
        b.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        b.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        b.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        b.reflectiveCurveTo(13.97f, 3.0f, 9.0f, 3.0f);
        k4.r(b, 11.09f, 15.5f, 8.59f, 13.0f);
        b.curveTo(8.21f, 12.62f, 8.0f, 12.12f, 8.0f, 11.59f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(3.59f);
        b.lineToRelative(2.5f, 2.5f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveTo(12.11f, 15.89f, 11.48f, 15.89f, 11.09f, 15.5f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.99f, 5.08f, 17.99f, 5.08f);
        i.curveToRelative(0.0f, 0.37f, 0.21f, 0.69f, 0.53f, 0.88f);
        i.curveTo(20.6f, 7.17f, 22.0f, 9.42f, 22.0f, 12.0f);
        i.curveToRelative(0.0f, 2.58f, -1.4f, 4.83f, -3.48f, 6.04f);
        i.curveToRelative(-0.32f, 0.19f, -0.53f, 0.51f, -0.53f, 0.88f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, 0.77f, 0.84f, 1.25f, 1.51f, 0.86f);
        i.curveTo(22.18f, 18.22f, 24.0f, 15.32f, 24.0f, 12.0f);
        i.curveToRelative(0.0f, -3.32f, -1.82f, -6.22f, -4.5f, -7.78f);
        i.curveTo(18.83f, 3.83f, 17.99f, 4.31f, 17.99f, 5.08f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _browseGallery = build;
        build.getClass();
        return build;
    }
}
