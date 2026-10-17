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
import defpackage.af0;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BrowseGalleryKt {
    private static ImageVector _browseGallery;

    public static final ImageVector getBrowseGallery(Icons.Filled filled) {
        ImageVector imageVector = _browseGallery;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BrowseGallery", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        k4.r(b, 11.79f, 16.21f, 8.0f, 12.41f);
        kf0.r(b, 7.0f, 2.0f, 4.59f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 3.21f, 3.21f, 11.79f, 16.21f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(17.99f, 3.52f, 2.16f);
        h.curveTo(20.36f, 6.8f, 22.0f, 9.21f, 22.0f, 12.0f);
        h.curveToRelative(0.0f, 2.79f, -1.64f, 5.2f, -4.01f, 6.32f);
        h.verticalLineToRelative(2.16f);
        h.curveTo(21.48f, 19.24f, 24.0f, 15.91f, 24.0f, 12.0f);
        h.curveTo(24.0f, 8.09f, 21.48f, 4.76f, 17.99f, 3.52f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _browseGallery = build;
        build.getClass();
        return build;
    }
}
