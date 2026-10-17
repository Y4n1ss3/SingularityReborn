package androidx.compose.material.icons.filled;

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
import defpackage.er;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssistantDirectionKt {
    private static ImageVector _assistantDirection;

    public static final ImageVector getAssistantDirection(Icons.Filled filled) {
        ImageVector imageVector = _assistantDirection;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AssistantDirection", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(14.0f, 10.0f, 9.0f, 10.0f);
        i.curveToRelative(-0.6f, 0.0f, -1.0f, 0.4f, -1.0f, 1.0f);
        r6.D(i, 4.0f, 2.0f, -3.0f, 4.0f);
        i.verticalLineToRelative(2.5f);
        i.lineToRelative(3.5f, -3.5f);
        r6.C(i, 14.0f, 7.5f, 14.0f, 10.0f);
        i.moveTo(12.0f, 1.0f);
        i.curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f);
        i.reflectiveCurveToRelative(4.9f, 11.0f, 11.0f, 11.0f);
        i.reflectiveCurveToRelative(11.0f, -4.9f, 11.0f, -11.0f);
        i.reflectiveCurveTo(18.1f, 1.0f, 12.0f, 1.0f);
        k4.x(i, 19.73f, 12.58f, -7.19f, 7.22f);
        i.curveToRelative(-0.35f, 0.27f, -0.79f, 0.27f, -1.15f, 0.0f);
        i.lineTo(4.2f, 12.58f);
        i.curveToRelative(-0.27f, -0.36f, -0.27f, -0.8f, 0.0f, -1.16f);
        i.lineToRelative(7.19f, -7.22f);
        i.curveToRelative(0.35f, -0.27f, 0.79f, -0.27f, 1.15f, 0.0f);
        i.lineToRelative(7.19f, 7.22f);
        i.curveToRelative(0.36f, 0.27f, 0.36f, 0.8f, 0.0f, 1.16f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistantDirection = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getAssistantDirection$annotations(Icons.Filled filled) {
    }
}
