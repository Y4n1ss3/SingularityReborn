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
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArtTrackKt {
    private static ImageVector _artTrack;

    public static final ImageVector getArtTrack(Icons.Sharp sharp) {
        ImageVector imageVector = _artTrack;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ArtTrack", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(22.0f, 13.0f, -8.0f, -2.0f, 8.0f);
        bv.m(n, 2.0f, 22.0f, 7.0f, -8.0f);
        uo.D(n, 2.0f, 8.0f, 22.0f, 7.0f);
        k4.C(n, 14.0f, 17.0f, 8.0f, -2.0f);
        fc.x(n, -8.0f, 2.0f, 12.0f, 7.0f);
        n.verticalLineToRelative(10.0f);
        n.lineTo(2.0f, 17.0f);
        uf.j(n, 2.0f, 7.0f, 10.0f);
        n.moveTo(10.5f, 15.0f);
        n.lineToRelative(-2.25f, -3.0f);
        n.lineToRelative(-1.75f, 2.26f);
        n.lineToRelative(-1.25f, -1.51f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(n, 3.5f, 15.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _artTrack = build;
        build.getClass();
        return build;
    }
}
