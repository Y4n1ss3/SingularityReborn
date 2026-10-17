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
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SchemaKt {
    private static ImageVector _schema;

    public static final ImageVector getSchema(Icons.Rounded rounded) {
        ImageVector imageVector = _schema;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Schema", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(14.0f, 10.5f, 11.0f, -3.0f, -0.5f);
        c.curveTo(11.0f, 9.67f, 10.33f, 9.0f, 9.5f, 9.0f);
        af0.f(c, -1.0f, 7.0f, 1.0f);
        c.curveTo(10.33f, 7.0f, 11.0f, 6.33f, 11.0f, 5.5f);
        c.verticalLineToRelative(-3.0f);
        c.curveTo(11.0f, 1.67f, 10.33f, 1.0f, 9.5f, 1.0f);
        c.horizontalLineToRelative(-4.0f);
        c.curveTo(4.67f, 1.0f, 4.0f, 1.67f, 4.0f, 2.5f);
        c.verticalLineToRelative(3.0f);
        c.curveTo(4.0f, 6.33f, 4.67f, 7.0f, 5.5f, 7.0f);
        kf0.x(c, 1.0f, 2.0f, -1.0f);
        c.curveTo(4.67f, 9.0f, 4.0f, 9.67f, 4.0f, 10.5f);
        c.verticalLineToRelative(3.0f);
        c.curveTo(4.0f, 14.33f, 4.67f, 15.0f, 5.5f, 15.0f);
        kf0.x(c, 1.0f, 2.0f, -1.0f);
        c.curveTo(4.67f, 17.0f, 4.0f, 17.67f, 4.0f, 18.5f);
        c.verticalLineToRelative(3.0f);
        c.curveTo(4.0f, 22.33f, 4.67f, 23.0f, 5.5f, 23.0f);
        c.horizontalLineToRelative(4.0f);
        c.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        c.verticalLineToRelative(-3.0f);
        c.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        kf0.x(c, -1.0f, -2.0f, 1.0f);
        c.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        kf0.r(c, 13.0f, 3.0f, 0.5f);
        c.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        c.horizontalLineToRelative(4.0f);
        c.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        c.verticalLineToRelative(-3.0f);
        c.curveTo(21.0f, 9.67f, 20.33f, 9.0f, 19.5f, 9.0f);
        c.horizontalLineToRelative(-4.0f);
        c.curveTo(14.67f, 9.0f, 14.0f, 9.67f, 14.0f, 10.5f);
        c.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _schema = build;
        build.getClass();
        return build;
    }
}
