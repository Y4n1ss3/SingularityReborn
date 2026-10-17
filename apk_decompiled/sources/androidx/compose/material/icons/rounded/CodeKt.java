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
public final class CodeKt {
    private static ImageVector _code;

    public static final ImageVector getCode(Icons.Rounded rounded) {
        ImageVector imageVector = _code;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Code", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(8.7f, 15.9f, 4.8f, 12.0f);
        i.lineToRelative(3.9f, -3.9f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.01f, 0.0f, -1.4f);
        i.curveToRelative(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0.0f);
        i.lineToRelative(-4.59f, 4.59f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(4.59f, 4.6f);
        i.curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.01f, 0.0f, -1.4f);
        k4.x(i, 15.3f, 15.9f, 3.9f, -3.9f);
        i.lineToRelative(-3.9f, -3.9f);
        i.curveToRelative(-0.39f, -0.39f, -0.39f, -1.01f, 0.0f, -1.4f);
        i.curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0.0f);
        i.lineToRelative(4.59f, 4.59f);
        i.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(-4.59f, 4.6f);
        i.curveToRelative(-0.39f, 0.39f, -1.01f, 0.39f, -1.4f, 0.0f);
        i.curveToRelative(-0.39f, -0.39f, -0.39f, -1.01f, 0.0f, -1.4f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _code = build;
        build.getClass();
        return build;
    }
}
