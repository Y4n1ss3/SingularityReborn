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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScoreboardKt {
    private static ImageVector _scoreboard;

    public static final ImageVector getScoreboard(Icons.Outlined outlined) {
        ImageVector imageVector = _scoreboard;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Scoreboard", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(18.0f, 9.0f, -2.5f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.verticalLineToRelative(4.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineTo(18.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.verticalLineToRelative(-4.0f);
        a.curveTo(19.0f, 9.45f, 18.55f, 9.0f, 18.0f, 9.0f);
        uo.q(a, 17.5f, 13.5f, 16.0f, -3.0f);
        uo.r(a, 1.5f, 13.5f, 9.5f, 15.0f);
        a.horizontalLineTo(5.0f);
        a.verticalLineToRelative(-2.5f);
        a.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        gy.o(a, 2.0f, -1.0f, 5.0f, 9.0f);
        a.horizontalLineToRelative(3.5f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.verticalLineToRelative(1.5f);
        a.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        bv.l(a, -2.0f, 1.0f, 3.0f, 15.0f);
        j50.y(a, 12.75f, 11.0f, -1.5f, 9.5f);
        uo.r(a, 1.5f, 11.0f, 12.75f, 14.5f);
        j50.D(a, -1.5f, 13.0f, 1.5f, 14.5f);
        a.moveTo(22.0f, 6.0f);
        a.verticalLineToRelative(12.0f);
        a.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        a.horizontalLineTo(4.0f);
        a.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        a.verticalLineTo(6.0f);
        a.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        af0.q(a, 3.0f, 2.0f, 2.0f, 2.0f);
        af0.q(a, 6.0f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(3.0f);
        a.curveTo(21.1f, 4.0f, 22.0f, 4.9f, 22.0f, 6.0f);
        fc.A(a, 20.0f, 18.0f, 6.0f, -7.25f);
        bv.B(a, 1.5f, -1.5f, 6.0f, 4.0f);
        r6.D(a, 12.0f, 7.25f, -1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(a, 18.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scoreboard = build;
        build.getClass();
        return build;
    }
}
