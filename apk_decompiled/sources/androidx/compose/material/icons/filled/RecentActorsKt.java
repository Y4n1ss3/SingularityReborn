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
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RecentActorsKt {
    private static ImageVector _recentActors;

    public static final ImageVector getRecentActors(Icons.Filled filled) {
        ImageVector imageVector = _recentActors;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RecentActors", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(21.0f, 5.0f, 14.0f, 2.0f);
        uf.j(m, 23.0f, 5.0f, -2.0f);
        m.moveTo(17.0f, 19.0f);
        uo.n(m, 2.0f, 19.0f, 5.0f, -2.0f);
        r6.l(m, 14.0f, 14.0f, 5.0f);
        m.lineTo(2.0f, 5.0f);
        m.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        m.verticalLineToRelative(12.0f);
        m.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        m.horizontalLineToRelative(12.0f);
        m.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        m.lineTo(15.0f, 6.0f);
        m.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        m.close();
        m.moveTo(8.0f, 7.75f);
        m.curveToRelative(1.24f, 0.0f, 2.25f, 1.01f, 2.25f, 2.25f);
        m.reflectiveCurveTo(9.24f, 12.25f, 8.0f, 12.25f);
        m.reflectiveCurveTo(5.75f, 11.24f, 5.75f, 10.0f);
        m.reflectiveCurveTo(6.76f, 7.75f, 8.0f, 7.75f);
        r6.B(m, 12.5f, 17.0f, -9.0f, -0.75f);
        m.curveToRelative(0.0f, -1.5f, 3.0f, -2.25f, 4.5f, -2.25f);
        m.reflectiveCurveToRelative(4.5f, 0.75f, 4.5f, 2.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(m, 12.5f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recentActors = build;
        build.getClass();
        return build;
    }
}
