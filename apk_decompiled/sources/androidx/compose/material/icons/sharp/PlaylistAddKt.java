package androidx.compose.material.icons.sharp;

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
import defpackage.er;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlaylistAddKt {
    private static ImageVector _playlistAdd;

    public static final ImageVector getPlaylistAdd(Icons.Sharp sharp) {
        ImageVector imageVector = _playlistAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PlaylistAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(14.0f, 10.0f, 3.0f, 2.0f, 11.0f);
        k4.B(i, 10.0f, 14.0f, 6.0f, 3.0f);
        k4.p(i, 2.0f, 11.0f, 6.0f);
        bv.y(i, 18.0f, 14.0f, -4.0f, -2.0f);
        r6.D(i, 4.0f, -4.0f, 2.0f, 4.0f);
        r6.D(i, 4.0f, 2.0f, -4.0f, 4.0f);
        kf0.n(i, -2.0f, 18.0f, 3.0f, 16.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.s(i, 7.0f, -2.0f, 3.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playlistAdd = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getPlaylistAdd$annotations(Icons.Sharp sharp) {
    }
}
