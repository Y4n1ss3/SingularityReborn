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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GamesKt {
    private static ImageVector _games;

    public static final ImageVector getGames(Icons.TwoTone twoTone) {
        ImageVector imageVector = _games;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Games", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(11.0f, 17.33f, 11.0f, 20.0f, 2.0f);
        uo.t(k, -2.67f, -1.0f, -1.0f);
        k.moveTo(13.0f, 6.67f);
        fc.w(k, 13.0f, 4.0f, -2.0f, 2.67f);
        fc.B(k, 1.0f, 1.0f, 16.33f, 12.0f);
        k.lineToRelative(1.0f, 1.0f);
        kp0.x(k, 20.0f, 13.0f, -2.0f, -2.67f);
        bv.y(k, 4.0f, 11.0f, 2.0f, 2.67f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k, 1.0f, -1.0f, -1.0f, -1.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(2.0f, 9.0f, 6.0f, 5.5f);
        m.lineToRelative(3.0f, -3.0f);
        gy.B(m, -3.0f, -3.0f, 2.0f, 9.0f);
        m.moveTo(6.67f, 13.0f);
        af0.m(m, 4.0f, 13.0f, -2.0f, 2.67f);
        fc.C(m, 1.0f, 1.0f, -1.0f, 1.0f);
        m.moveTo(22.0f, 9.0f);
        m.horizontalLineToRelative(-5.5f);
        m.lineToRelative(-3.0f, 3.0f);
        m.lineToRelative(3.0f, 3.0f);
        r6.C(m, 22.0f, 15.0f, 22.0f, 9.0f);
        m.moveTo(20.0f, 13.0f);
        m.horizontalLineToRelative(-2.67f);
        m.lineToRelative(-1.0f, -1.0f);
        m.lineToRelative(1.0f, -1.0f);
        bv.r(m, 20.0f, 11.0f, 2.0f);
        m.moveTo(15.0f, 16.5f);
        m.lineToRelative(-3.0f, -3.0f);
        m.lineToRelative(-3.0f, 3.0f);
        r6.m(m, 9.0f, 22.0f, 6.0f, -5.5f);
        k4.C(m, 13.0f, 20.0f, -2.0f, -2.67f);
        m.lineToRelative(1.0f, -1.0f);
        gy.B(m, 1.0f, 1.0f, 13.0f, 20.0f);
        m.moveTo(9.0f, 7.5f);
        m.lineToRelative(3.0f, 3.0f);
        m.lineToRelative(3.0f, -3.0f);
        m.lineTo(15.0f, 2.0f);
        bv.r(m, 9.0f, 2.0f, 5.5f);
        k4.C(m, 11.0f, 4.0f, 2.0f, 2.67f);
        m.lineToRelative(-1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(m, -1.0f, -1.0f, 11.0f, 4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _games = build;
        build.getClass();
        return build;
    }
}
