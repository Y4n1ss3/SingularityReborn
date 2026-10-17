package androidx.compose.material.icons.outlined;

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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlaylistAddCircleKt {
    private static ImageVector _playlistAddCircle;

    public static final ImageVector getPlaylistAddCircle(Icons.Outlined outlined) {
        ImageVector imageVector = _playlistAddCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PlaylistAddCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b.reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f);
        uo.q(b, 14.0f, 10.0f, 7.0f, 2.0f);
        uo.r(b, 7.0f, 10.0f, 14.0f, 7.0f);
        bv.h(b, 7.0f, 2.0f, 7.0f, 7.0f);
        k4.C(b, 7.0f, 15.0f, 3.0f, -2.0f);
        bv.s(b, 7.0f, 15.0f, 19.0f, 13.0f);
        r6.D(b, 2.0f, -2.0f, 2.0f, -2.0f);
        r6.D(b, -2.0f, -2.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.i(b, -2.0f, 2.0f, 2.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playlistAddCircle = build;
        build.getClass();
        return build;
    }
}
