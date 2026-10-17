package defpackage;

import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class fn implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode e;

    public /* synthetic */ fn(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, int i) {
        this.d = i;
        this.e = coreTextFieldSemanticsModifierNode;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 updateNodeSemantics$lambda$0;
        boolean applySemantics$lambda$8;
        w01 _init_$lambda$0;
        int i = this.d;
        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.e;
        switch (i) {
            case 0:
                updateNodeSemantics$lambda$0 = CoreTextFieldSemanticsModifierNode.updateNodeSemantics$lambda$0(coreTextFieldSemanticsModifierNode);
                return updateNodeSemantics$lambda$0;
            case 1:
                applySemantics$lambda$8 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$8(coreTextFieldSemanticsModifierNode);
                break;
            case 2:
                applySemantics$lambda$8 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$9(coreTextFieldSemanticsModifierNode);
                break;
            case 3:
                applySemantics$lambda$8 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$10(coreTextFieldSemanticsModifierNode);
                break;
            case 4:
                _init_$lambda$0 = CoreTextFieldSemanticsModifierNode._init_$lambda$0(coreTextFieldSemanticsModifierNode);
                return _init_$lambda$0;
            case 5:
                applySemantics$lambda$8 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$11(coreTextFieldSemanticsModifierNode);
                break;
            case 6:
                applySemantics$lambda$8 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$6(coreTextFieldSemanticsModifierNode);
                break;
            default:
                applySemantics$lambda$8 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$7(coreTextFieldSemanticsModifierNode);
                break;
        }
        return Boolean.valueOf(applySemantics$lambda$8);
    }
}
