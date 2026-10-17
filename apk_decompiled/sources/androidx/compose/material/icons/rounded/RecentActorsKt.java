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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RecentActorsKt {
    private static ImageVector _recentActors;

    public static final ImageVector getRecentActors(Icons.Rounded rounded) {
        ImageVector imageVector = _recentActors;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RecentActors", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(21.0f, 6.0f, 12.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        h.lineTo(23.0f, 6.0f);
        h.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        h.close();
        h.moveTo(18.0f, 19.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.lineTo(19.0f, 6.0f);
        h.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        h.verticalLineToRelative(12.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        k4.r(h, 14.0f, 5.0f, 2.0f, 5.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        h.verticalLineToRelative(12.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.horizontalLineToRelative(12.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.lineTo(15.0f, 6.0f);
        h.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.close();
        h.moveTo(8.0f, 7.75f);
        h.curveToRelative(1.24f, 0.0f, 2.25f, 1.01f, 2.25f, 2.25f);
        h.reflectiveCurveTo(9.24f, 12.25f, 8.0f, 12.25f);
        h.reflectiveCurveTo(5.75f, 11.24f, 5.75f, 10.0f);
        h.reflectiveCurveTo(6.76f, 7.75f, 8.0f, 7.75f);
        r6.B(h, 12.5f, 17.0f, -9.0f, -0.75f);
        h.curveToRelative(0.0f, -1.5f, 3.0f, -2.25f, 4.5f, -2.25f);
        h.reflectiveCurveToRelative(4.5f, 0.75f, 4.5f, 2.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(h, 12.5f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recentActors = build;
        build.getClass();
        return build;
    }
}
