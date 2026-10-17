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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScoreboardKt {
    private static ImageVector _scoreboard;

    public static final ImageVector getScoreboard(Icons.Filled filled) {
        ImageVector imageVector = _scoreboard;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Scoreboard", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(17.5f, 13.5f, 16.0f, -3.0f, 1.5f);
        k4.D(i, 13.5f, 20.0f, 4.0f, -3.0f);
        j50.B(i, 2.0f, -2.0f, 2.0f, 9.0f);
        i.verticalLineTo(2.0f);
        i.horizontalLineTo(7.0f);
        i.verticalLineToRelative(2.0f);
        i.horizontalLineTo(4.0f);
        i.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(6.0f);
        i.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        i.close();
        i.moveTo(9.5f, 11.5f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        af0.w(i, -2.0f, 1.0f, 3.0f, 15.0f);
        i.horizontalLineTo(5.0f);
        i.verticalLineToRelative(-2.5f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        gy.o(i, 2.0f, -1.0f, 5.0f, 9.0f);
        i.horizontalLineToRelative(3.5f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        k4.D(i, 11.5f, 12.75f, 18.0f, -1.5f);
        k4.p(i, -1.5f, 1.5f, 18.0f);
        j50.y(i, 12.75f, 14.5f, -1.5f, 13.0f);
        uo.r(i, 1.5f, 14.5f, 12.75f, 11.0f);
        j50.D(i, -1.5f, 9.5f, 1.5f, 11.0f);
        j50.y(i, 12.75f, 7.5f, -1.5f, 6.0f);
        uo.r(i, 1.5f, 7.5f, 19.0f, 14.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        i.horizontalLineToRelative(-2.5f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.verticalLineToRelative(-4.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineTo(18.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(i, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scoreboard = build;
        build.getClass();
        return build;
    }
}
