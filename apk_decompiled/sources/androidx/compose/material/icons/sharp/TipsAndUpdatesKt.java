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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TipsAndUpdatesKt {
    private static ImageVector _tipsAndUpdates;

    public static final ImageVector getTipsAndUpdates(Icons.Sharp sharp) {
        ImageVector imageVector = _tipsAndUpdates;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TipsAndUpdates", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(7.0f, 20.0f, 4.0f);
        a.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        a.reflectiveCurveTo(7.0f, 21.1f, 7.0f, 20.0f);
        r6.B(a, 5.0f, 19.0f, 8.0f, -2.0f);
        bv.s(a, 5.0f, 19.0f, 16.5f, 9.5f);
        a.curveToRelative(0.0f, 3.82f, -2.66f, 5.86f, -3.77f, 6.5f);
        a.horizontalLineTo(5.27f);
        a.curveTo(4.16f, 15.36f, 1.5f, 13.32f, 1.5f, 9.5f);
        a.curveTo(1.5f, 5.36f, 4.86f, 2.0f, 9.0f, 2.0f);
        a.reflectiveCurveTo(16.5f, 5.36f, 16.5f, 9.5f);
        k4.r(a, 21.37f, 7.37f, 20.0f, 8.0f);
        a.lineToRelative(1.37f, 0.63f);
        a.lineTo(22.0f, 10.0f);
        a.lineToRelative(0.63f, -1.37f);
        a.lineTo(24.0f, 8.0f);
        a.lineToRelative(-1.37f, -0.63f);
        r6.C(a, 22.0f, 6.0f, 21.37f, 7.37f);
        a.moveTo(19.0f, 6.0f);
        a.lineToRelative(0.94f, -2.06f);
        a.lineTo(22.0f, 3.0f);
        a.lineToRelative(-2.06f, -0.94f);
        a.lineTo(19.0f, 0.0f);
        a.lineToRelative(-0.94f, 2.06f);
        a.lineTo(16.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(a, 2.06f, 0.94f, 19.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tipsAndUpdates = build;
        build.getClass();
        return build;
    }
}
