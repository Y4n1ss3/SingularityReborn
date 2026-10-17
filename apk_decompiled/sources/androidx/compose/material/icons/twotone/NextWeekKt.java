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
import defpackage.er;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NextWeekKt {
    private static ImageVector _nextWeek;

    public static final ImageVector getNextWeek(Icons.TwoTone twoTone) {
        ImageVector imageVector = _nextWeek;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NextWeek", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(4.0f, 20.0f, 16.0f, 20.0f, 9.0f);
        bv.r(p, 4.0f, 9.0f, 11.0f);
        p.moveTo(10.0f, 11.5f);
        p.lineToRelative(1.0f, -1.0f);
        p.lineToRelative(4.0f, 4.0f);
        p.lineToRelative(-4.0f, 4.0f);
        p.lineToRelative(-1.0f, -1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(p, 3.0f, -3.0f, -3.0f, -3.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(11.0f, 18.5f, 4.0f, -4.0f);
        e.lineToRelative(-4.0f, -4.0f);
        e.lineToRelative(-1.0f, 1.0f);
        fc.C(e, 3.0f, 3.0f, -3.0f, 3.0f);
        e.moveTo(20.0f, 7.0f);
        e.horizontalLineToRelative(-4.0f);
        e.lineTo(16.0f, 5.0f);
        e.curveToRelative(0.0f, -0.55f, -0.22f, -1.05f, -0.59f, -1.41f);
        e.curveTo(15.05f, 3.22f, 14.55f, 3.0f, 14.0f, 3.0f);
        e.horizontalLineToRelative(-4.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.verticalLineToRelative(2.0f);
        e.lineTo(4.0f, 7.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.verticalLineToRelative(11.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(16.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.lineTo(22.0f, 9.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        r6.B(e, 10.0f, 5.0f, 4.0f, 2.0f);
        gy.n(e, -4.0f, 10.0f, 5.0f);
        e.moveTo(20.0f, 20.0f);
        e.lineTo(4.0f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(e, 4.0f, 9.0f, 16.0f, 11.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nextWeek = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getNextWeek$annotations(Icons.TwoTone twoTone) {
    }
}
