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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LibraryMusicKt {
    private static ImageVector _libraryMusic;

    public static final ImageVector getLibraryMusic(Icons.Sharp sharp) {
        ImageVector imageVector = _libraryMusic;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LibraryMusic", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(22.0f, 2.0f, 6.0f, 2.0f, 16.0f);
        gy.n(s, 16.0f, 22.0f, 2.0f);
        k4.C(s, 18.0f, 7.0f, -3.0f, 5.5f);
        s.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        s.reflectiveCurveTo(10.0f, 13.88f, 10.0f, 12.5f);
        s.reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f);
        s.curveToRelative(0.57f, 0.0f, 1.08f, 0.19f, 1.5f, 0.51f);
        r6.m(s, 14.0f, 5.0f, 4.0f, 2.0f);
        s.moveTo(4.0f, 6.0f);
        af0.m(s, 2.0f, 6.0f, 16.0f, 16.0f);
        s.verticalLineToRelative(-2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(s, 4.0f, 20.0f, 4.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _libraryMusic = build;
        build.getClass();
        return build;
    }
}
