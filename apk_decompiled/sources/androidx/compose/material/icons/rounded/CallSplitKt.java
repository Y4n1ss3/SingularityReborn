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
import defpackage.er;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CallSplitKt {
    private static ImageVector _callSplit;

    public static final ImageVector getCallSplit(Icons.Rounded rounded) {
        ImageVector imageVector = _callSplit;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CallSplit", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.85f, 4.85f, 1.44f, 1.44f);
        e.lineToRelative(-2.88f, 2.88f);
        e.lineToRelative(1.42f, 1.42f);
        e.lineToRelative(2.88f, -2.88f);
        e.lineToRelative(1.44f, 1.44f);
        e.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.36f);
        e.verticalLineTo(4.5f);
        e.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        e.horizontalLineToRelative(-4.29f);
        e.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.36f, 0.85f);
        r6.g(e, 8.79f, 4.0f, 4.5f);
        e.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        e.verticalLineToRelative(4.29f);
        e.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        e.lineTo(6.29f, 7.7f);
        e.lineTo(11.0f, 12.4f);
        e.verticalLineTo(19.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineToRelative(-7.0f);
        e.curveToRelative(0.0f, -0.26f, -0.11f, -0.52f, -0.29f, -0.71f);
        e.lineToRelative(-5.0f, -5.01f);
        e.lineToRelative(1.44f, -1.44f);
        e.curveToRelative(0.31f, -0.3f, 0.09f, -0.84f, -0.36f, -0.84f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _callSplit = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getCallSplit$annotations(Icons.Rounded rounded) {
    }
}
