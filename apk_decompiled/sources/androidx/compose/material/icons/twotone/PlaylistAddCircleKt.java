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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlaylistAddCircleKt {
    private static ImageVector _playlistAddCircle;

    public static final ImageVector getPlaylistAddCircle(Icons.TwoTone twoTone) {
        ImageVector imageVector = _playlistAddCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PlaylistAddCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        b.reflectiveCurveTo(16.41f, 4.0f, 12.0f, 4.0f);
        r6.B(b, 7.0f, 7.0f, 7.0f, 2.0f);
        bv.s(b, 7.0f, 7.0f, 10.0f, 15.0f);
        bv.h(b, 7.0f, -2.0f, 3.0f, 15.0f);
        bv.y(b, 7.0f, 12.0f, -2.0f, 7.0f);
        kf0.n(b, 2.0f, 7.0f, 17.0f, 15.0f);
        r6.D(b, 2.0f, -2.0f, -2.0f, -2.0f);
        r6.D(b, -2.0f, 2.0f, -2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.i(b, 2.0f, 2.0f, 2.0f, 17.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 20.0f);
        b2.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b2.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b2.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b2.reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f);
        uo.q(b2, 14.0f, 10.0f, 7.0f, 2.0f);
        uo.r(b2, 7.0f, 10.0f, 14.0f, 7.0f);
        bv.h(b2, 7.0f, 2.0f, 7.0f, 7.0f);
        k4.C(b2, 7.0f, 15.0f, 3.0f, -2.0f);
        bv.s(b2, 7.0f, 15.0f, 19.0f, 13.0f);
        r6.D(b2, 2.0f, -2.0f, 2.0f, -2.0f);
        r6.D(b2, -2.0f, -2.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.i(b2, -2.0f, 2.0f, 2.0f, 19.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playlistAddCircle = build;
        build.getClass();
        return build;
    }
}
