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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CreateKt {
    private static ImageVector _create;

    public static final ImageVector getCreate(Icons.Outlined outlined) {
        ImageVector imageVector = _create;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Create", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = fc.c(3.0f, 17.25f, 21.0f, 3.75f);
        c.lineTo(17.81f, 9.94f);
        gy.B(c, -3.75f, -3.75f, 3.0f, 17.25f);
        k4.A(c, 5.92f, 19.0f, 5.0f, -0.92f);
        c.lineToRelative(9.06f, -9.06f);
        gy.B(c, 0.92f, 0.92f, 5.92f, 19.0f);
        c.moveTo(20.71f, 5.63f);
        c.lineToRelative(-2.34f, -2.34f);
        c.curveToRelative(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
        c.reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f);
        c.lineToRelative(-1.83f, 1.83f);
        c.lineToRelative(3.75f, 3.75f);
        c.lineToRelative(1.83f, -1.83f);
        c.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        c.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _create = build;
        build.getClass();
        return build;
    }
}
