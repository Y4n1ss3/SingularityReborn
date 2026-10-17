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
import defpackage.fc;
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RiceBowlKt {
    private static ImageVector _riceBowl;

    public static final ImageVector getRiceBowl(Icons.Rounded rounded) {
        ImageVector imageVector = _riceBowl;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RiceBowl", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.0f, 12.0f, 22.0f, 12.0f);
        i.curveToRelative(0.0f, -5.48f, -4.4f, -9.93f, -9.86f, -10.0f);
        i.curveTo(8.52f, 1.95f, 5.29f, 4.03f, 3.43f, 7.14f);
        i.curveTo(0.1f, 12.69f, 2.98f, 18.27f, 8.0f, 20.25f);
        i.verticalLineToRelative(0.25f);
        i.curveTo(8.0f, 21.33f, 8.67f, 22.0f, 9.5f, 22.0f);
        i.horizontalLineToRelative(5.0f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        i.verticalLineToRelative(-0.25f);
        i.curveTo(19.53f, 18.86f, 22.0f, 15.69f, 22.0f, 12.0f);
        af0.r(i, 20.0f, 12.0f, -4.0f, 5.08f);
        i.curveTo(18.39f, 6.47f, 20.0f, 9.05f, 20.0f, 12.0f);
        fc.A(i, 14.0f, 4.26f, 12.0f, -4.0f);
        i.verticalLineTo(4.26f);
        i.curveTo(10.64f, 4.1f, 11.31f, 4.0f, 12.0f, 4.0f);
        i.reflectiveCurveTo(13.36f, 4.1f, 14.0f, 4.26f);
        i.close();
        i.moveTo(4.0f, 12.0f);
        i.curveToRelative(0.0f, -2.95f, 1.61f, -5.53f, 4.0f, -6.92f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(i, 12.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _riceBowl = build;
        build.getClass();
        return build;
    }
}
