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
public final class ApiKt {
    private static ImageVector _api;

    public static final ImageVector getApi(Icons.Rounded rounded) {
        ImageVector imageVector = _api;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Api", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(13.0f, 13.0f, 13.0f, 13.0f);
        i.curveToRelative(-0.56f, 0.56f, -1.45f, 0.56f, -2.0f, 0.01f);
        i.lineTo(11.0f, 13.0f);
        i.curveToRelative(-0.55f, -0.55f, -0.55f, -1.44f, 0.0f, -1.99f);
        i.lineTo(11.0f, 11.0f);
        i.curveToRelative(0.55f, -0.55f, 1.44f, -0.55f, 1.99f, 0.0f);
        i.lineTo(13.0f, 11.0f);
        i.curveTo(13.55f, 11.55f, 13.55f, 12.45f, 13.0f, 13.0f);
        k4.x(i, 12.0f, 6.0f, 2.12f, 2.12f);
        i.lineToRelative(2.5f, -2.5f);
        i.lineToRelative(-3.2f, -3.2f);
        i.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        i.lineToRelative(-3.2f, 3.2f);
        gy.B(i, 2.5f, 2.5f, 12.0f, 6.0f);
        i.moveTo(6.0f, 12.0f);
        i.lineToRelative(2.12f, -2.12f);
        i.lineToRelative(-2.5f, -2.5f);
        i.lineToRelative(-3.2f, 3.2f);
        i.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        i.lineToRelative(3.2f, 3.2f);
        gy.B(i, 2.5f, -2.5f, 6.0f, 12.0f);
        i.moveTo(18.0f, 12.0f);
        i.lineToRelative(-2.12f, 2.12f);
        i.lineToRelative(2.5f, 2.5f);
        i.lineToRelative(3.2f, -3.2f);
        i.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        i.lineToRelative(-3.2f, -3.2f);
        gy.B(i, -2.5f, 2.5f, 18.0f, 12.0f);
        i.moveTo(12.0f, 18.0f);
        i.lineToRelative(-2.12f, -2.12f);
        i.lineToRelative(-2.5f, 2.5f);
        i.lineToRelative(3.2f, 3.2f);
        i.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        i.lineToRelative(3.2f, -3.2f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, -2.5f, -2.5f, 12.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _api = build;
        build.getClass();
        return build;
    }
}
