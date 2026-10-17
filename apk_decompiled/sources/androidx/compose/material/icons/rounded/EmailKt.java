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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmailKt {
    private static ImageVector _email;

    public static final ImageVector getEmail(Icons.Rounded rounded) {
        ImageVector imageVector = _email;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Email", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 4.0f, 4.0f, 4.0f);
        i.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        i.lineTo(2.0f, 18.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 6.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(i, 19.6f, 8.25f, -7.07f, 4.42f);
        i.curveToRelative(-0.32f, 0.2f, -0.74f, 0.2f, -1.06f, 0.0f);
        i.lineTo(4.4f, 8.25f);
        i.curveToRelative(-0.25f, -0.16f, -0.4f, -0.43f, -0.4f, -0.72f);
        i.curveToRelative(0.0f, -0.67f, 0.73f, -1.07f, 1.3f, -0.72f);
        i.lineTo(12.0f, 11.0f);
        i.lineToRelative(6.7f, -4.19f);
        i.curveToRelative(0.57f, -0.35f, 1.3f, 0.05f, 1.3f, 0.72f);
        i.curveToRelative(0.0f, 0.29f, -0.15f, 0.56f, -0.4f, 0.72f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _email = build;
        build.getClass();
        return build;
    }
}
