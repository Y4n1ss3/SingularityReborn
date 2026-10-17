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
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RealEstateAgentKt {
    private static ImageVector _realEstateAgent;

    public static final ImageVector getRealEstateAgent(Icons.Filled filled) {
        ImageVector imageVector = _realEstateAgent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RealEstateAgent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(1.0f, 22.0f, 4.0f, 11.0f, 1.0f);
        k4.D(v, 22.0f, 20.0f, 17.0f, -7.0f);
        v.lineToRelative(-2.09f, -0.73f);
        v.lineToRelative(0.33f, -0.94f);
        v.lineTo(13.0f, 16.0f);
        v.horizontalLineToRelative(2.82f);
        v.curveToRelative(0.65f, 0.0f, 1.18f, -0.53f, 1.18f, -1.18f);
        v.lineToRelative(0.0f, 0.0f);
        v.curveToRelative(0.0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f);
        r6.w(v, 8.97f, 11.0f, 7.0f, 9.02f);
        v.lineTo(14.0f, 22.0f);
        v.lineToRelative(8.0f, -3.0f);
        v.lineToRelative(0.0f, 0.0f);
        v.curveTo(21.99f, 17.9f, 21.11f, 17.0f, 20.0f, 17.0f);
        k4.x(v, 14.0f, 1.5f, -7.0f, 5.0f);
        uo.u(v, 9.0f, 2.0f, 8.14f, 3.26f);
        v.curveTo(18.26f, 12.71f, 19.0f, 13.79f, 19.0f, 15.0f);
        uf.w(v, 2.0f, 6.5f, 14.0f, 1.5f);
        j50.y(v, 13.5f, 10.0f, -1.0f, 9.0f);
        uo.r(v, 1.0f, 10.0f, 13.5f, 8.0f);
        j50.D(v, -1.0f, 7.0f, 1.0f, 8.0f);
        j50.y(v, 15.5f, 10.0f, -1.0f, 9.0f);
        uo.r(v, 1.0f, 10.0f, 15.5f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.h(v, -1.0f, 7.0f, 1.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _realEstateAgent = build;
        build.getClass();
        return build;
    }
}
