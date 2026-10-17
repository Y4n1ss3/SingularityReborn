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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlaylistRemoveKt {
    private static ImageVector _playlistRemove;

    public static final ImageVector getPlaylistRemove(Icons.Rounded rounded) {
        ImageVector imageVector = _playlistRemove;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PlaylistRemove", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.71f, 21.3f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineTo(17.0f, 19.41f);
        b.lineToRelative(1.89f, 1.89f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(18.41f, 18.0f);
        b.lineToRelative(1.89f, -1.89f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0.0f);
        b.lineTo(17.0f, 16.59f);
        b.lineToRelative(-1.89f, -1.89f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.reflectiveCurveToRelative(-0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(15.59f, 18.0f);
        b.lineToRelative(-1.89f, 1.89f);
        b.curveTo(13.32f, 20.27f, 13.32f, 20.91f, 13.71f, 21.3f);
        b.close();
        b.moveTo(14.0f, 11.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(9.0f);
        b.curveTo(13.55f, 12.0f, 14.0f, 11.55f, 14.0f, 11.0f);
        b.close();
        b.moveTo(14.0f, 7.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(4.0f);
        b.curveTo(3.45f, 6.0f, 3.0f, 6.45f, 3.0f, 7.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(9.0f);
        b.curveTo(13.55f, 8.0f, 14.0f, 7.55f, 14.0f, 7.0f);
        b.close();
        b.moveTo(3.0f, 15.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(5.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(4.0f);
        b.curveTo(3.45f, 14.0f, 3.0f, 14.45f, 3.0f, 15.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playlistRemove = build;
        build.getClass();
        return build;
    }
}
