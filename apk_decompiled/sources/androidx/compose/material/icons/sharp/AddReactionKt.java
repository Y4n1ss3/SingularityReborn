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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddReactionKt {
    private static ImageVector _addReaction;

    public static final ImageVector getAddReaction(Icons.Sharp sharp) {
        ImageVector imageVector = _addReaction;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AddReaction", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = uf.c(18.0f, 9.0f, 7.0f, -2.0f, 2.84f);
        c.curveTo(14.77f, 2.3f, 13.42f, 2.0f, 11.99f, 2.0f);
        c.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        c.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        c.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        c.curveToRelative(0.0f, -1.05f, -0.17f, -2.05f, -0.47f, -3.0f);
        k4.w(c, 18.0f, 15.5f, 8.0f);
        c.curveTo(16.33f, 8.0f, 17.0f, 8.67f, 17.0f, 9.5f);
        c.reflectiveCurveTo(16.33f, 11.0f, 15.5f, 11.0f);
        c.reflectiveCurveTo(14.0f, 10.33f, 14.0f, 9.5f);
        c.reflectiveCurveTo(14.67f, 8.0f, 15.5f, 8.0f);
        c.close();
        c.moveTo(8.5f, 8.0f);
        c.curveTo(9.33f, 8.0f, 10.0f, 8.67f, 10.0f, 9.5f);
        c.reflectiveCurveTo(9.33f, 11.0f, 8.5f, 11.0f);
        c.reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f);
        c.reflectiveCurveTo(7.67f, 8.0f, 8.5f, 8.0f);
        c.close();
        c.moveTo(12.0f, 17.5f);
        c.curveToRelative(-2.33f, 0.0f, -4.31f, -1.46f, -5.11f, -3.5f);
        c.horizontalLineToRelative(10.22f);
        c.curveTo(16.31f, 16.04f, 14.33f, 17.5f, 12.0f, 17.5f);
        r6.B(c, 22.0f, 3.0f, 2.0f, 2.0f);
        af0.w(c, -2.0f, 2.0f, -2.0f, 5.0f);
        af0.n(c, -2.0f, 3.0f, 2.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(c, 2.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addReaction = build;
        build.getClass();
        return build;
    }
}
