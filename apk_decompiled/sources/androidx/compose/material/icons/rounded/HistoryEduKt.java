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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HistoryEduKt {
    private static ImageVector _historyEdu;

    public static final ImageVector getHistoryEdu(Icons.Rounded rounded) {
        ImageVector imageVector = _historyEdu;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HistoryEdu", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(9.0f, 5.0f, 0.38f);
        h.curveToRelative(-0.83f, -0.33f, -1.72f, -0.5f, -2.61f, -0.5f);
        h.curveToRelative(-1.42f, 0.0f, -2.84f, 0.43f, -4.05f, 1.29f);
        h.curveTo(1.83f, 6.53f, 1.77f, 7.26f, 2.21f, 7.7f);
        r6.q(h, 2.57f, 2.57f, 1.11f, 1.11f);
        h.curveToRelative(0.86f, 0.86f, 1.98f, 1.31f, 3.11f, 1.36f);
        h.verticalLineTo(15.0f);
        h.horizontalLineTo(7.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        h.verticalLineToRelative(2.0f);
        h.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        h.horizontalLineToRelative(10.0f);
        h.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        h.verticalLineTo(5.0f);
        h.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.horizontalLineTo(10.0f);
        h.curveTo(9.45f, 4.0f, 9.0f, 4.45f, 9.0f, 5.0f);
        uo.A(h, 7.89f, 10.41f, 8.26f, 5.61f);
        h.lineTo(4.57f, 7.22f);
        h.curveTo(5.14f, 7.0f, 5.76f, 6.88f, 6.39f, 6.88f);
        h.curveToRelative(1.34f, 0.0f, 2.59f, 0.52f, 3.54f, 1.46f);
        h.lineToRelative(1.41f, 1.41f);
        h.lineToRelative(-0.2f, 0.2f);
        h.curveToRelative(-0.51f, 0.51f, -1.19f, 0.8f, -1.92f, 0.8f);
        h.curveTo(8.75f, 10.75f, 8.29f, 10.63f, 7.89f, 10.41f);
        h.close();
        h.moveTo(19.0f, 17.0f);
        h.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        h.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        h.verticalLineToRelative(-1.0f);
        h.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.horizontalLineToRelative(-5.0f);
        h.verticalLineToRelative(-2.59f);
        h.curveToRelative(0.57f, -0.23f, 1.1f, -0.57f, 1.56f, -1.03f);
        h.lineToRelative(0.2f, -0.2f);
        r6.w(h, 15.59f, 14.0f, 17.0f, -1.41f);
        fc.u(h, -6.0f, -5.97f, 6.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(h, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _historyEdu = build;
        build.getClass();
        return build;
    }
}
