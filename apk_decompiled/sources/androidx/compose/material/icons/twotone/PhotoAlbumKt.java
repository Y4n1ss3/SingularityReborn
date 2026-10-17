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
import defpackage.bv;
import defpackage.c21;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoAlbumKt {
    private static ImageVector _photoAlbum;

    public static final ImageVector getPhotoAlbum(Icons.TwoTone twoTone) {
        ImageVector imageVector = _photoAlbum;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhotoAlbum", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(16.0f, 4.0f, 7.0f, -2.5f, -1.5f);
        uf.u(n, 11.0f, 11.0f, 4.0f, 6.0f);
        uf.y(n, 16.0f, 12.0f, 4.0f, 16.0f);
        n.moveTo(7.0f, 18.0f);
        n.lineToRelative(2.38f, -3.17f);
        n.lineTo(11.0f, 17.0f);
        n.lineToRelative(2.62f, -3.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(n, 17.0f, 18.0f, 7.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(18.0f, 2.0f, 6.0f);
        d.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(4.0f);
        d.curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f);
        c21.d(d, 18.0f, 20.0f, 6.0f, 4.0f);
        bv.p(d, 5.0f, 7.0f, 2.5f, -1.5f);
        fc.t(d, 16.0f, 11.0f, 4.0f, 2.0f);
        bv.t(d, 20.0f, 13.62f, 13.5f);
        d.lineTo(17.0f, 18.0f);
        d.horizontalLineTo(7.0f);
        d.lineToRelative(2.38f, -3.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(d, 11.0f, 17.0f, 13.62f, 13.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoAlbum = build;
        build.getClass();
        return build;
    }
}
