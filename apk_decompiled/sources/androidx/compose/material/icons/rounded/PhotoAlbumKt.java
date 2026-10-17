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
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoAlbumKt {
    private static ImageVector _photoAlbum;

    public static final ImageVector getPhotoAlbum(Icons.Rounded rounded) {
        ImageVector imageVector = _photoAlbum;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhotoAlbum", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(18.0f, 2.0f, 6.0f);
        d.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(4.0f);
        d.curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f);
        k4.r(d, 15.24f, 10.55f, 13.5f, 9.5f);
        d.lineToRelative(-1.74f, 1.05f);
        d.curveToRelative(-0.33f, 0.2f, -0.76f, -0.04f, -0.76f, -0.43f);
        kf0.r(d, 4.0f, 5.0f, 6.12f);
        d.curveTo(16.0f, 10.51f, 15.58f, 10.75f, 15.24f, 10.55f);
        k4.x(d, 7.6f, 17.2f, 1.38f, -1.83f);
        d.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        d.lineTo(11.0f, 17.0f);
        d.lineToRelative(2.23f, -2.97f);
        d.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        d.lineToRelative(2.38f, 3.17f);
        d.curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f);
        d.horizontalLineTo(8.0f);
        d.curveTo(7.59f, 18.0f, 7.35f, 17.53f, 7.6f, 17.2f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoAlbum = build;
        build.getClass();
        return build;
    }
}
