package androidx.compose.material.icons.automirrored.sharp;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NextWeekKt {
    private static ImageVector _nextWeek;

    public static final ImageVector getNextWeek(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _nextWeek;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.NextWeek", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(22.0f, 7.0f, -6.0f, 16.0f, 5.0f);
        p.curveToRelative(0.0f, -0.55f, -0.22f, -1.05f, -0.59f, -1.41f);
        p.curveTo(15.05f, 3.22f, 14.55f, 3.0f, 14.0f, 3.0f);
        p.horizontalLineToRelative(-4.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        bv.q(p, 2.0f, 2.0f, 7.0f, 15.0f);
        gy.n(p, 20.0f, 22.0f, 7.0f);
        k4.C(p, 10.0f, 5.0f, 4.0f, 2.0f);
        gy.n(p, -4.0f, 10.0f, 5.0f);
        p.moveTo(11.0f, 18.5f);
        p.lineToRelative(-1.0f, -1.0f);
        p.lineToRelative(3.0f, -3.0f);
        p.lineToRelative(-3.0f, -3.0f);
        p.lineToRelative(1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(p, 4.0f, 4.0f, -4.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nextWeek = build;
        build.getClass();
        return build;
    }
}
