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
import defpackage.bv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignalCellularNodataKt {
    private static ImageVector _signalCellularNodata;

    public static final ImageVector getSignalCellularNodata(Icons.Rounded rounded) {
        ImageVector imageVector = _signalCellularNodata;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SignalCellularNodata", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(22.0f, 13.0f, -7.0f);
        a.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.verticalLineToRelative(7.0f);
        a.horizontalLineTo(4.41f);
        a.curveToRelative(-0.89f, 0.0f, -1.34f, -1.08f, -0.71f, -1.71f);
        a.lineTo(20.29f, 3.71f);
        a.curveTo(20.92f, 3.08f, 22.0f, 3.52f, 22.0f, 4.41f);
        bv.t(a, 13.0f, 20.3f, 14.71f);
        a.lineTo(20.3f, 14.71f);
        a.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        a.lineToRelative(-1.39f, 1.39f);
        a.lineToRelative(-1.39f, -1.39f);
        a.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        a.lineToRelative(0.0f, 0.0f);
        a.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        a.lineToRelative(1.39f, 1.39f);
        a.lineToRelative(-1.39f, 1.39f);
        a.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        a.lineToRelative(0.0f, 0.0f);
        a.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        a.lineToRelative(1.39f, -1.38f);
        a.lineToRelative(1.39f, 1.38f);
        a.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        a.lineToRelative(0.0f, 0.0f);
        a.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        a.lineToRelative(-1.38f, -1.39f);
        a.lineToRelative(1.38f, -1.39f);
        a.curveTo(20.69f, 15.73f, 20.69f, 15.1f, 20.3f, 14.71f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalCellularNodata = build;
        build.getClass();
        return build;
    }
}
